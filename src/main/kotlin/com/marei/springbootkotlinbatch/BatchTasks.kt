package com.marei.springbootkotlinbatch

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class BatchTasks {
    // initialDelay：アプリケーションが起動してから何秒後に実行するか（ミリ秒指定）
    // fixedDelay：何秒ごとに処理を実行するか（ミリ秒指定）
    // アプリケーション起動5秒後と10秒間隔で実行
    @Scheduled(initialDelay = 5000, fixedDelay = 10000)
    fun helloWorld() {
        println("はろー、わーるど！")
    }

    // cron：cron 記法で実行時間を指定
    // zone：cron の起動時間のタイムゾーンを指定
    // 毎日00時00分00秒に実行
    @Scheduled(cron = "0 0 0 * * *", zone = "Asia/Tokyo")
    fun helloWorld2() {
        println("はろー、わーるど！2")
    }
}
