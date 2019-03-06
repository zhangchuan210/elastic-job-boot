package com.crf.elasticjobboot;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MyElasticJob implements SimpleJob {

    @Override
    public void execute(ShardingContext context) {
        System.out.println("2===============:" + context.getShardingItem());

    }
}
