package o;

import com.okinc.market.quotation.data.model.DexTokenPo;
import com.okinc.market.quotation.domain.dex.SearchDexPosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41498qru implements InterfaceC49404uns<kotlin.Pair<? extends java.lang.String, ? extends DexPeriodEnum>, java.util.List<? extends DexTokenPo>> {
    public final C41448qqx OLrzqt;

    @yCM
    public C41498qru(@NotNull C41448qqx c41448qqx) {
        Intrinsics.checkNotNullParameter(c41448qqx, "");
        this.OLrzqt = c41448qqx;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<java.lang.String, ? extends DexPeriodEnum> pair, @NotNull Continuation<? super java.util.List<DexTokenPo>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, pair, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((kotlin.Pair<java.lang.String, ? extends DexPeriodEnum>) obj, (Continuation<? super java.util.List<DexTokenPo>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<java.lang.String, ? extends DexPeriodEnum> pair, @NotNull Continuation<? super java.util.List<DexTokenPo>> continuation) throws java.lang.Throwable {
        SearchDexPosUseCase$onExecute$1 searchDexPosUseCase$onExecute$1;
        if (continuation instanceof SearchDexPosUseCase$onExecute$1) {
            searchDexPosUseCase$onExecute$1 = (SearchDexPosUseCase$onExecute$1) continuation;
            int i = searchDexPosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchDexPosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                searchDexPosUseCase$onExecute$1 = new SearchDexPosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = searchDexPosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchDexPosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.lang.String strComponent1 = pair.component1();
            DexPeriodEnum dexPeriodEnumComponent2 = pair.component2();
            C41434qqj.KWHzl.KWHzl("SearchDexPosUseCase", "search dex pos, [input: " + pair + "]");
            java.lang.String string = strComponent1 != null ? StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strComponent1).toString() : null;
            if (string == null || string.length() == 0) {
                return null;
            }
            C41448qqx c41448qqx = this.OLrzqt;
            int value = dexPeriodEnumComponent2.getValue();
            searchDexPosUseCase$onExecute$1.label = 1;
            objKWHzl = c41448qqx.KWHzl(string, java.lang.String.valueOf(value), searchDexPosUseCase$onExecute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.List list = (java.util.List) objKWHzl;
        return list == null ? yDY.AhwBna() : list;
    }
}
