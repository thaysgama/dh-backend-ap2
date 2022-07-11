package com.dh.catalog.queue;

import com.dh.catalog.entity.Catalog;
import com.dh.catalog.service.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SerieConsumer {
	private final CatalogService catalogService;

	@RabbitListener(queues = {"${queue.serie.name}"})
	public void receive(@Payload Object object) {
		Catalog catalog = new Catalog();
		catalog.setObject(object);
		catalogService.save(catalog);
	}
}
