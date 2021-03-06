package com.scmspain.kafka.clients.consumer;

import com.scmspain.kafka.clients.annotation.Consumer;
import kafka.message.MessageAndMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Subscriber;

@Consumer(topic = "middleware_campaign_manager_test", groupId = "forlayo", streams = 2)
public class KafkaConsumer2 extends Subscriber<MessageAndMetadata<byte[], byte[]>> {

  private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer2.class);

  public KafkaConsumer2() {

  }

  @Override
  public void onCompleted() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void onError(Throwable e) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void onNext(MessageAndMetadata<byte[], byte[]> messageAndMetadata) {
    System.out.println(messageAndMetadata.message() + "***** from KafkaConsumer2");
    LOGGER.info(new String(messageAndMetadata.message()) + "***** from KafkaConsumer2");
  }
}
