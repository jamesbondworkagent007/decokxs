package com.okinc.business.defi.wallet.common.tonconnect.storage;

import android.content.SharedPreferences;
import java.security.KeyStore;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C16065ecr;
import o.C47235tmH;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class EncryptedStorageProvider$get$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SharedPreferences>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C16065ecr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptedStorageProvider$get$2(C16065ecr c16065ecr, Continuation<? super EncryptedStorageProvider$get$2> continuation) {
        super(2, continuation);
        this.this$0 = c16065ecr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EncryptedStorageProvider$get$2 encryptedStorageProvider$get$2 = new EncryptedStorageProvider$get$2(this.this$0, continuation);
        encryptedStorageProvider$get$2.L$0 = obj;
        return encryptedStorageProvider$get$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SharedPreferences> continuation) {
        return ((EncryptedStorageProvider$get$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SharedPreferences sharedPreferencesEZpvd;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedPreferences sharedPreferences = this.this$0.EZpvd;
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            Object obj2 = this.this$0.OLrzqt;
            C16065ecr c16065ecr = this.this$0;
            synchronized (obj2) {
                sharedPreferencesEZpvd = c16065ecr.EZpvd;
                if (sharedPreferencesEZpvd == null) {
                    try {
                        sharedPreferencesEZpvd = c16065ecr.EZpvd();
                        c16065ecr.EZpvd = sharedPreferencesEZpvd;
                    } catch (Exception e) {
                        pUU.AEQbTJ("EncryptedStorageProvider", "Resetting keys due to error: " + e.getMessage(), e);
                        try {
                            KeyStore keyStoreCopydefault = C47235tmH.OLrzqt.copydefault();
                            if (keyStoreCopydefault != null && keyStoreCopydefault.containsAlias("okx_wallet")) {
                                keyStoreCopydefault.deleteEntry("okx_wallet");
                            }
                        } catch (Exception e2) {
                            pUU.AEQbTJ("EncryptedStorageProvider", "Failed to delete main key", e2);
                        }
                        try {
                            c16065ecr.AEQbTJ.getSharedPreferences("okx_wallet_storage", 0).edit().clear().apply();
                            sharedPreferencesEZpvd = c16065ecr.EZpvd();
                            c16065ecr.EZpvd = sharedPreferencesEZpvd;
                        } catch (Exception e3) {
                            pUU.AEQbTJ("EncryptedStorageProvider", "Failed creating encrypted prefs for the second time", e3);
                            sharedPreferencesEZpvd = null;
                        }
                    }
                }
            }
            return sharedPreferencesEZpvd;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
