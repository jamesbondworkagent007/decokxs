package com.okinc.lifecycle.impl.deeplink.handler;

import android.content.Context;
import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.lifecycle.impl.deeplink.core.LinkStatus;
import com.okinc.lifecycle.impl.deeplink.handler.ShortCodeLinkHandler$executeLink$1;
import com.okinc.modular.deeplinkv2.LinkSource;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43238rlX;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC43232rlR;
import o.InterfaceC43294rma;
import o.pKG;
import o.pLV;
import o.pLZ;
import o.pMI;

/* JADX INFO: loaded from: classes9.dex */
public final class ShortCodeLinkHandler$executeLink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $acContext;
    final /* synthetic */ InterfaceC43232rlR $metadata;
    final /* synthetic */ Map<String, Object> $params;
    int label;
    final /* synthetic */ pLV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortCodeLinkHandler$executeLink$1(pLV plv, InterfaceC43232rlR interfaceC43232rlR, Context context, Map<String, ? extends Object> map, Continuation<? super ShortCodeLinkHandler$executeLink$1> continuation) {
        super(2, continuation);
        this.this$0 = plv;
        this.$metadata = interfaceC43232rlR;
        this.$acContext = context;
        this.$params = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortCodeLinkHandler$executeLink$1(this.this$0, this.$metadata, this.$acContext, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShortCodeLinkHandler$executeLink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pMI pmi = this.this$0.AEQbTJ;
            String strAEQbTJ = this.$metadata.AEQbTJ();
            this.label = 1;
            obj = pmi.EZpvd(strAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        pKG pkg = (pKG) obj;
        if (pkg instanceof pKG.ActionBar) {
            pKG.ActionBar actionBar = (pKG.ActionBar) pkg;
            String str = (String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((CharSequence) actionBar.EZpvd(), new String[]{"?"}, false, 0, 6, (Object) null));
            if (str == null) {
                str = "";
            }
            InterfaceC43294rma.Application.processDeeplink$default(this.this$0.EZpvd, this.$acContext, str, C56424yEw.OLrzqt(actionBar.AEQbTJ(), this.$params), LinkSource.SHORTCODE_HANDLER, false, new Function1() { // from class: o.pLY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ShortCodeLinkHandler$executeLink$1.invokeSuspend$lambda$0((AbstractC43238rlX) obj2);
                }
            }, 16, null);
            this.this$0.copydefault.KWHzl(actionBar.EZpvd(), LinkStatus.SUCCESS.getStatus());
        } else if (pkg instanceof pKG.StateListAnimator) {
            this.this$0.EZpvd(pLZ.AEQbTJ(((pKG.StateListAnimator) pkg).AEQbTJ()));
        } else {
            this.this$0.EZpvd(LinkState.SHORTCODE_API_FAILED);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AbstractC43238rlX abstractC43238rlX) {
        return Unit.INSTANCE;
    }
}
