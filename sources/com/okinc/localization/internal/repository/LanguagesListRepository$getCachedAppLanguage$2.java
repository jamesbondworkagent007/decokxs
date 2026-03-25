package com.okinc.localization.internal.repository;

import android.content.Context;
import com.okinc.localization2.bean.server.AppLanguage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.yFA;
import o.yFK;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagesListRepository$getCachedAppLanguage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AppLanguage>, Object> {
    final /* synthetic */ String $market;
    int label;
    final /* synthetic */ LanguagesListRepository this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagesListRepository$getCachedAppLanguage$2(LanguagesListRepository languagesListRepository, String str, Continuation<? super LanguagesListRepository$getCachedAppLanguage$2> continuation) {
        super(2, continuation);
        this.this$0 = languagesListRepository;
        this.$market = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LanguagesListRepository$getCachedAppLanguage$2(this.this$0, this.$market, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AppLanguage> continuation) {
        return ((LanguagesListRepository$getCachedAppLanguage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            LanguagesListRepository languagesListRepository = this.this$0;
            Context context = languagesListRepository.copydefault;
            String strCopydefault = this.$market;
            if (strCopydefault == null) {
                strCopydefault = this.this$0.copydefault();
            }
            File fileEZpvd = languagesListRepository.EZpvd(context, strCopydefault);
            if (!fileEZpvd.exists()) {
                return null;
            }
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(fileEZpvd), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                yFA.copydefault(bufferedReader, null);
                return this.this$0.KWHzl(strAEQbTJ);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    yFA.copydefault(bufferedReader, th);
                    throw th2;
                }
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
