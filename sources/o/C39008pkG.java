package o;

import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.localization.util.format.OKDateEnum;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pkG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39008pkG implements InterfaceC49405unt<java.util.List<? extends KLineEventBean>, java.util.List<? extends oLS>> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pkJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39008pkG.OLrzqt();
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.pkL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39008pkG.AEQbTJ(this.EZpvd);
        }
    });
    public final float EZpvd = C55298xhM.dp$default(32, (android.content.Context) null, 1, (java.lang.Object) null);
    public final float copydefault = C55298xhM.dp$default(1, (android.content.Context) null, 1, (java.lang.Object) null);

    @yCM
    public C39008pkG() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC49405unt
    public /* synthetic */ java.util.List<? extends oLS> AEQbTJ(java.util.List<? extends KLineEventBean> list) {
        return OLrzqt((java.util.List<KLineEventBean>) list);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<oLS> EZpvd(@NotNull java.util.List<KLineEventBean> list) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, list);
    }

    /* JADX INFO: renamed from: o.pkG$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pkG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C36246oUr OLrzqt() {
        return C36246oUr.copydefault();
    }

    private final C36246oUr copydefault() {
        return (C36246oUr) this.OLrzqt.getValue();
    }

    private final TemplateSetting AEQbTJ() {
        return (TemplateSetting) this.AEQbTJ.getValue();
    }

    public static final TemplateSetting AEQbTJ(C39008pkG c39008pkG) {
        return c39008pkG.copydefault().KWHzl("ds0");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:20|(12:25|(4:27|(1:29)(1:30)|31|(1:33)(4:34|(1:36)|37|(1:39)(1:41)))(0)|42|63|43|(3:45|(2:47|67)(2:48|66)|49)|65|50|54|(1:56)|57|58)(1:24)|40|42|63|43|(0)|65|50|54|(0)|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0191, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0192, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m7377constructorimpl(o.C56391yDq.EZpvd(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:43:0x00e2, B:45:0x00fd, B:47:0x011a, B:49:0x015c, B:48:0x0123, B:50:0x015f), top: B:63:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<oLS> OLrzqt(@NotNull java.util.List<KLineEventBean> list) {
        oWN own;
        float f;
        float f2;
        float f3;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        int size;
        int i;
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty() && (own = copydefault().DCJXGO().get("ds0")) != null) {
            com.okinc.kline.library.data.DataSource dataSource = copydefault().sSMYrx().get("ds0");
            if (dataSource == null || dataSource.AEQbTJ.size() < 2) {
                return yDY.AhwBna();
            }
            if (copydefault().ODWQjV() > 1440 || copydefault().ODWQjV() == 0) {
                return yDY.AhwBna();
            }
            if (AEQbTJ().getSPTimeInterval() == 1440 && copydefault().EZpvd("ds0") == 2) {
                pUU.EZpvd("GetEconomicEventUseCase", "1 day 缩放到折线图  ---->  25% ");
                f2 = this.EZpvd;
                f3 = 4.5f;
            } else {
                if (AEQbTJ().getSPTimeInterval() == 1440) {
                    float fFJNWhG = own.fJNWhG();
                    int[] iArr = oWN.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(iArr, "");
                    if (fFJNWhG <= (yDV.uzCIH(iArr) != null ? r8.intValue() : 0) / 4) {
                        pUU.EZpvd("GetEconomicEventUseCase", "1 day 小于 candle 的 1/4  ---->  33% ");
                        f2 = this.EZpvd;
                        f3 = 3;
                    } else {
                        float fFJNWhG2 = own.fJNWhG();
                        int[] iArr2 = oWN.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(iArr2, "");
                        if (fFJNWhG2 <= (yDV.uzCIH(iArr2) != null ? r2.intValue() : 0) / 4) {
                            pUU.EZpvd("GetEconomicEventUseCase", "小于 candle 的 1/4  ---->  50% ");
                            f2 = this.EZpvd;
                            f3 = 2;
                        } else {
                            pUU.EZpvd("GetEconomicEventUseCase", "normal case  ---->  1% ");
                            f = this.EZpvd - this.copydefault;
                        }
                    }
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                Result.Application application = Result.Companion;
                KLineEventBean kLineEventBean = (KLineEventBean) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
                java.util.List<KLineEventBean> listAhwBna = yDY.AhwBna(kLineEventBean);
                float fEZpvd = EZpvd(kLineEventBean, dataSource, own);
                size = list.size();
                for (i = 1; i < size; i++) {
                    KLineEventBean kLineEventBean2 = (KLineEventBean) CollectionsKt___CollectionsKt.AubY(listAhwBna);
                    KLineEventBean kLineEventBean3 = list.get(i);
                    if (java.lang.Math.abs(EZpvd(kLineEventBean3, dataSource, own) - EZpvd(kLineEventBean2, dataSource, own)) <= f) {
                        listAhwBna.add(kLineEventBean3);
                        fEZpvd += EZpvd(kLineEventBean3, dataSource, own);
                    } else {
                        arrayList.add(new oLS(((KLineEventBean) CollectionsKt___CollectionsKt.AubY(listAhwBna)).getDate(), fEZpvd / listAhwBna.size(), AEQbTJ2(listAhwBna), listAhwBna.size(), false, 16, null));
                        listAhwBna = yDY.AhwBna(kLineEventBean3);
                        fEZpvd = EZpvd(kLineEventBean3, dataSource, own);
                    }
                }
                java.lang.Object objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(arrayList.add(new oLS(((KLineEventBean) CollectionsKt___CollectionsKt.AubY(listAhwBna)).getDate(), fEZpvd / listAhwBna.size(), AEQbTJ2(listAhwBna), listAhwBna.size(), false, 16, null))));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("GetEconomicEventUseCase", "fail to merge event list cause by " + thM7380exceptionOrNullimpl);
                }
                return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            }
            f = f2 / f3;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            Result.Application application2 = Result.Companion;
            KLineEventBean kLineEventBean4 = (KLineEventBean) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
            java.util.List<KLineEventBean> listAhwBna2 = yDY.AhwBna(kLineEventBean4);
            float fEZpvd2 = EZpvd(kLineEventBean4, dataSource, own);
            size = list.size();
            while (i < size) {
            }
            java.lang.Object objM7377constructorimpl2 = Result.m7377constructorimpl(java.lang.Boolean.valueOf(arrayList2.add(new oLS(((KLineEventBean) CollectionsKt___CollectionsKt.AubY(listAhwBna2)).getDate(), fEZpvd2 / listAhwBna2.size(), AEQbTJ2(listAhwBna2), listAhwBna2.size(), false, 16, null))));
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
        }
        return yDY.AhwBna();
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public final java.util.List<oLP> AEQbTJ2(java.util.List<KLineEventBean> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String date$default = pTA.formatDate$default(new Date(((KLineEventBean) obj).getDate()), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
            java.lang.Object arrayList2 = linkedHashMap.get(date$default);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(date$default, arrayList2);
            }
            ((java.util.List) arrayList2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            arrayList.add(new oLR(str));
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public final float EZpvd(KLineEventBean kLineEventBean, com.okinc.kline.library.data.DataSource dataSource, oWN own) {
        if (dataSource.AEQbTJ.size() < 2) {
            return 0.0f;
        }
        return own.AYXKKw((int) ((kLineEventBean.getDate() - dataSource.AEQbTJ.get(0).AhwBna()) / (dataSource.AEQbTJ.get(1).AhwBna() - dataSource.AEQbTJ.get(0).AhwBna())));
    }
}
