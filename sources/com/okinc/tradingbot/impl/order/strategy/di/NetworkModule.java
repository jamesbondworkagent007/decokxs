package com.okinc.tradingbot.impl.order.strategy.di;

import java.util.concurrent.TimeUnit;
import o.C43280rmM;
import o.C43393roT;
import o.C43417ror;
import o.C56524yIo;
import o.InterfaceC50050vAa;
import o.InterfaceC50053vAd;
import o.InterfaceC50055vAf;
import o.yCR;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes11.dex */
public final class NetworkModule {
    public static final NetworkModule AEQbTJ = new NetworkModule();

    private NetworkModule() {
    }

    @yCR
    public final InterfaceC50055vAf KWHzl() {
        return (InterfaceC50055vAf) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC50055vAf.class));
    }

    @yCR
    public final InterfaceC50053vAd OLrzqt() {
        return (InterfaceC50053vAd) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC50053vAd.class));
    }

    public static final class ActionBar extends C43280rmM {
        public ActionBar() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // o.C43280rmM
        public OkHttpClient.Builder initClientBuilder() {
            OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return builderInitClientBuilder.readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).callTimeout(60L, timeUnit);
        }
    }

    @yCR
    public final InterfaceC50050vAa copydefault() {
        return (InterfaceC50050vAa) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC50050vAa.class), new ActionBar());
    }
}
