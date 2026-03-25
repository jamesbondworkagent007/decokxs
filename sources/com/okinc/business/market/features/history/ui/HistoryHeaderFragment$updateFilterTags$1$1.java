package com.okinc.business.market.features.history.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.history.ui.HistoryHeaderFragment$updateFilterTags$1$1;
import com.okinc.business.market.features.tag.ui.TagViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C25382ivf;
import o.C26211jWa;
import o.C33054mpH;
import o.C33057mpK;
import o.C33070mpX;
import o.C52761wXj;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C57406yhn;
import o.jXH;
import o.kMS;
import o.kMY;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class HistoryHeaderFragment$updateFilterTags$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<C26211jWa> $tags;
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ jXH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryHeaderFragment$updateFilterTags$1$1(List<C26211jWa> list, jXH jxh, View view, Continuation<? super HistoryHeaderFragment$updateFilterTags$1$1> continuation) {
        super(2, continuation);
        this.$tags = list;
        this.this$0 = jxh;
        this.$view = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryHeaderFragment$updateFilterTags$1$1(this.$tags, this.this$0, this.$view, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryHeaderFragment$updateFilterTags$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        } else {
            C56391yDq.AEQbTJ(obj);
            List<C26211jWa> list = this.$tags;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C26211jWa) it.next()).copydefault());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((String) obj2).length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            String strCopydefault = this.this$0.fetchVPNInfo().djBIcL().copydefault();
            String string = this.this$0.requireContext().getString(C23274hvD.Fragment.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A);
            Intrinsics.checkNotNullExpressionValue(string, "");
            boolean zEZpvd = Intrinsics.EZpvd((Object) strCopydefault, (Object) "");
            Drawable drawableKWHzl = C33070mpX.KWHzl(C57406yhn.Activity.values);
            if (drawableKWHzl != null) {
                C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            } else {
                drawableKWHzl = null;
            }
            kMS kms = new kMS(string, drawableKWHzl, null, null, zEZpvd, "", 12, null);
            TagViewModel tagViewModelValues = this.this$0.values();
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            boolean zAEQbTJ = C33054mpH.AEQbTJ(contextRequireContext);
            this.label = 1;
            objKWHzl = tagViewModelValues.KWHzl(arrayList2, strCopydefault, zAEQbTJ, kms, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        }
        List listAhwBna = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = listAhwBna;
        }
        final List<kMS> list2 = (List) objKWHzl;
        kMY.Application application = kMY.Companion;
        String strDjBIcL = this.this$0.AhwBna().djBIcL();
        final View view = this.$view;
        final jXH jxh = this.this$0;
        application.OLrzqt(list2, strDjBIcL, new Function1() { // from class: o.jXT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return HistoryHeaderFragment$updateFilterTags$1$1.invokeSuspend$lambda$4(view, jxh, list2, (kMS) obj3);
            }
        }).show(this.this$0.getChildFragmentManager(), "DexSelectionBottomSheet");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(View view, jXH jxh, List list, kMS kms) {
        Object next;
        view.setSelected(false);
        jxh.djBIcL().OLrzqt.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.dPnHjp));
        if (kms == null) {
            return Unit.INSTANCE;
        }
        Object objAYXKKw = kms.AYXKKw();
        String str = objAYXKKw instanceof String ? (String) objAYXKKw : null;
        if (str == null) {
            str = "";
        }
        C26211jWa c26211jWa = new C26211jWa(0, str, kms.EZpvd(), 1, null);
        TokenFilter tokenFilterEZpvd = jxh.fetchVPNInfo().EZpvd();
        HistoryChangeViewModel.updateFilter$default(jxh.fetchVPNInfo(), null, c26211jWa, tokenFilterEZpvd.OLrzqt((6143 & 1) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (6143 & 4) != 0 ? tokenFilterEZpvd.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (6143 & 16) != 0 ? tokenFilterEZpvd.KWHzl : yDY.AhwBna(), (6143 & 32) != 0 ? tokenFilterEZpvd.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterEZpvd.valueOf : false, (6143 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (6143 & 256) != 0 ? tokenFilterEZpvd.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterEZpvd.copydefault : null, (6143 & 2048) != 0 ? tokenFilterEZpvd.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null), 1, null);
        jxh.isConnected().KWHzl(jxh.fetchVPNInfo().EZpvd(), true);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd(((kMS) next).AYXKKw(), (Object) str)) {
                break;
            }
        }
        kMS kms2 = (kMS) next;
        String strEZpvd = kms2 != null ? kms2.EZpvd() : null;
        if (strEZpvd != null) {
            jxh.djBIcL().AEQbTJ.setTitle(strEZpvd);
        }
        return Unit.INSTANCE;
    }
}
