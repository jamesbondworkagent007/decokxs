package o;

import com.okinc.dexkline.market.features.holdings.domain.GetHoldingsUseCase$getHideSmallAssets$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nav, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34379nav {
    public final C32272mVw copydefault;

    @yCM
    public C34379nav(@NotNull C32272mVw c32272mVw) {
        Intrinsics.checkNotNullParameter(c32272mVw, "");
        this.copydefault = c32272mVw;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        GetHoldingsUseCase$getHideSmallAssets$1 getHoldingsUseCase$getHideSmallAssets$1;
        java.lang.Object objCopydefault;
        if (continuation instanceof GetHoldingsUseCase$getHideSmallAssets$1) {
            getHoldingsUseCase$getHideSmallAssets$1 = (GetHoldingsUseCase$getHideSmallAssets$1) continuation;
            int i = getHoldingsUseCase$getHideSmallAssets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHoldingsUseCase$getHideSmallAssets$1.label = i - Integer.MIN_VALUE;
            } else {
                getHoldingsUseCase$getHideSmallAssets$1 = new GetHoldingsUseCase$getHideSmallAssets$1(this, continuation);
            }
        }
        java.lang.Object obj = getHoldingsUseCase$getHideSmallAssets$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getHoldingsUseCase$getHideSmallAssets$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C32272mVw c32272mVw = this.copydefault;
            KSerializer<java.lang.Boolean> kSerializerSerializer = BuiltinSerializersKt.serializer(yHW.OLrzqt);
            getHoldingsUseCase$getHideSmallAssets$1.label = 1;
            objCopydefault = c32272mVw.copydefault("dex_my_position_hide_small_assets", kSerializerSerializer, getHoldingsUseCase$getHideSmallAssets$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        return Result.m7383isFailureimpl(objCopydefault) ? C56443yFo.KWHzl(true) : objCopydefault;
    }
}
