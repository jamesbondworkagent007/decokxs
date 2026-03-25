package com.okinc.business.market.features.trader.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.okinc.business.market.features.tag.ui.TagViewModel;
import com.okinc.business.market.features.trader.ui.TraderHeaderFragment$showTagFilterBottomSheet$1;
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
import o.C27698kAa;
import o.C29740kzO;
import o.C33054mpH;
import o.C33057mpK;
import o.C33070mpX;
import o.C52761wXj;
import o.C55052xcf;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C57406yhn;
import o.hAX;
import o.kMS;
import o.kMY;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class TraderHeaderFragment$showTagFilterBottomSheet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<C26211jWa> $filters;
    final /* synthetic */ C26211jWa $selectedFilterTag;
    int label;
    final /* synthetic */ C29740kzO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderHeaderFragment$showTagFilterBottomSheet$1(List<C26211jWa> list, C26211jWa c26211jWa, C29740kzO c29740kzO, Continuation<? super TraderHeaderFragment$showTagFilterBottomSheet$1> continuation) {
        super(2, continuation);
        this.$filters = list;
        this.$selectedFilterTag = c26211jWa;
        this.this$0 = c29740kzO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TraderHeaderFragment$showTagFilterBottomSheet$1(this.$filters, this.$selectedFilterTag, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TraderHeaderFragment$showTagFilterBottomSheet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            List<C26211jWa> list = this.$filters;
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
            String strCopydefault = this.$selectedFilterTag.copydefault();
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
            TagViewModel tagViewModelDjBIcL = this.this$0.djBIcL();
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            boolean zAEQbTJ = C33054mpH.AEQbTJ(contextRequireContext);
            this.label = 1;
            objKWHzl = tagViewModelDjBIcL.KWHzl(arrayList2, strCopydefault, zAEQbTJ, kms, this);
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
        String strGEmmrt = this.this$0.KWHzl().gEmmrt();
        final C29740kzO c29740kzO = this.this$0;
        application.OLrzqt(list2, strGEmmrt, new Function1() { // from class: o.kzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return TraderHeaderFragment$showTagFilterBottomSheet$1.invokeSuspend$lambda$4(c29740kzO, list2, (kMS) obj3);
            }
        }).show(this.this$0.getChildFragmentManager(), "DexSelectionBottomSheet");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(C29740kzO c29740kzO, List list, kMS kms) {
        Object next;
        hAX hax;
        C55052xcf c55052xcf;
        ImageView imageView;
        C55052xcf c55052xcf2;
        hAX hax2 = c29740kzO.AEQbTJ;
        if (hax2 != null && (c55052xcf2 = hax2.AEQbTJ) != null) {
            c55052xcf2.setSelected(false);
        }
        hAX hax3 = c29740kzO.AEQbTJ;
        if (hax3 != null && (imageView = hax3.copydefault) != null) {
            imageView.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.dPnHjp));
        }
        if (kms == null) {
            return Unit.INSTANCE;
        }
        Object objAYXKKw = kms.AYXKKw();
        String str = objAYXKKw instanceof String ? (String) objAYXKKw : null;
        if (str == null) {
            str = "";
        }
        C26211jWa c26211jWa = new C26211jWa(0, str, null, 5, null);
        TraderViewModel.updateFilter$default(c29740kzO.copydefault(), c26211jWa, null, null, false, 14, null);
        C29740kzO.setSharedFilter$default(c29740kzO, c26211jWa, null, true, 2, null);
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
        if (strEZpvd != null && (hax = c29740kzO.AEQbTJ) != null && (c55052xcf = hax.AEQbTJ) != null) {
            c55052xcf.setTitle(strEZpvd);
        }
        C27698kAa.trackTraderAction$default(str, null, null, c29740kzO.copydefault().AYXKKw(), 6, null);
        return Unit.INSTANCE;
    }
}
