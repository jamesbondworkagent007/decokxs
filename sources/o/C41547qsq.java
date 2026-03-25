package o;

import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.market.quotation.ui.model.OptionsDirection;
import com.okinc.trade.arch.util.Quintet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41547qsq extends AbstractC49400uno<Quintet<? extends OptionsCategoryGroupVo, ? extends java.lang.String, ? extends java.lang.String, ? extends OptionsDirection, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>>, java.util.List<? extends InterfaceC41642quf>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Quintet<OptionsCategoryGroupVo, java.lang.String, java.lang.String, ? extends OptionsDirection, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>>) obj, (Continuation<? super java.util.List<? extends InterfaceC41642quf>>) continuation);
    }

    @yCM
    public C41547qsq(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.qsq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.Object EZpvd(@NotNull Quintet<OptionsCategoryGroupVo, java.lang.String, java.lang.String, ? extends OptionsDirection, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>> quintet, @NotNull Continuation<? super java.util.List<? extends InterfaceC41642quf>> continuation) {
        java.util.List<? extends InterfaceC41642quf> list;
        OptionsCategoryGroupVo optionsCategoryGroupVoComponent1 = quintet.component1();
        java.lang.String strComponent2 = quintet.component2();
        java.lang.String strComponent3 = quintet.component3();
        OptionsDirection optionsDirectionComponent4 = quintet.component4();
        java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>> mapComponent5 = quintet.component5();
        C41434qqj.KWHzl.KWHzl("FilterOptionsVosUseCase", "filter options vos, category=" + optionsCategoryGroupVoComponent1.AEQbTJ() + ", expTime=" + strComponent2 + ", strikePrice=" + strComponent3 + ", direction=" + optionsDirectionComponent4);
        java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>> map = mapComponent5.get(optionsCategoryGroupVoComponent1);
        if (map == null || (list = map.get(strComponent2)) == null) {
            return null;
        }
        if (optionsDirectionComponent4 != OptionsDirection.ALL) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC41642quf) obj).OLrzqt().getOptionOptType(), (java.lang.Object) optionsDirectionComponent4.getValue())) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        if (strComponent3 != null && strComponent3.length() != 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC41642quf) obj2).OLrzqt().getStk(), (java.lang.Object) strComponent3)) {
                    arrayList2.add(obj2);
                }
            }
            list = arrayList2;
        }
        C41434qqj.KWHzl.KWHzl("FilterOptionsVosUseCase", "filter options vos result: " + list.size() + " items");
        return list;
    }
}
