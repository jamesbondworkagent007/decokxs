package com.okinc.network.okg.unifieddomain;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43381roH;
import o.C43383roJ;
import o.C43461rpi;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes9.dex */
public final class DomainConfigProcessor$selectOptimalDomains$2$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends String, ? extends String>>, Object> {
    final /* synthetic */ DomainConfig $config;
    final /* synthetic */ String $countryCode;
    int label;
    final /* synthetic */ C43381roH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DomainConfigProcessor$selectOptimalDomains$2$1$job$1(C43381roH c43381roH, DomainConfig domainConfig, String str, Continuation<? super DomainConfigProcessor$selectOptimalDomains$2$1$job$1> continuation) {
        super(2, continuation);
        this.this$0 = c43381roH;
        this.$config = domainConfig;
        this.$countryCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DomainConfigProcessor$selectOptimalDomains$2$1$job$1(this.this$0, this.$config, this.$countryCode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends String, ? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<String, String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<String, String>> continuation) {
        return ((DomainConfigProcessor$selectOptimalDomains$2$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<String> listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C43381roH c43381roH = this.this$0;
            List<String> domains = this.$config.getDomains();
            String detectionPath = this.$config.getDetectionPath();
            String scenario = this.$config.getScenario();
            this.label = 1;
            obj = c43381roH.EZpvd(domains, detectionPath, scenario, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C43383roJ c43383roJ = (C43383roJ) obj;
        C43461rpi c43461rpi = C43461rpi.copydefault;
        boolean z = c43383roJ.OLrzqt() != null;
        String scenario2 = this.$config.getScenario();
        String str = this.$countryCode;
        String strOLrzqt = c43383roJ.OLrzqt();
        if (strOLrzqt == null || (listAhwBna = C56402yEa.EZpvd(strOLrzqt)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        c43461rpi.KWHzl(z, scenario2, str, listAhwBna, c43383roJ.AEQbTJ());
        return C56390yDp.OLrzqt(this.$config.getScenario(), c43383roJ.OLrzqt());
    }
}
