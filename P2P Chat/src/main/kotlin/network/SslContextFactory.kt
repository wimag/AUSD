package network

import io.netty.handler.ssl.SslContext
import io.netty.handler.ssl.SslContextBuilder
import io.netty.handler.ssl.util.InsecureTrustManagerFactory
import io.netty.handler.ssl.util.SelfSignedCertificate

/**
 * Source
 * https://github.com/taojiaenx/netty_ssl_demo/blob/master/src/playground.main/java/com/tje/hdfs/TestSsl/SslContextFactory.java
 *
 */

object SslContextFactory {
    private val ssc = SelfSignedCertificate()
    val serverContext: SslContext = SslContextBuilder.forServer(ssc.certificate(), ssc.privateKey()).build()
    val clientContext: SslContext = SslContextBuilder.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build()
}