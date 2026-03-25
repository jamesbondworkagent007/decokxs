package o;

import com.okinc.dexkline.market.data.sp.DexSpRepo$getObject$1;
import com.okinc.dexkline.market.data.sp.DexSpRepo$getObject0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.data.sp.DexSpRepo$putObject$1;
import com.okinc.dexkline.market.data.sp.DexSpRepo$putObjectBWLJW6A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mVw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32272mVw {
    public final android.content.Context AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final Json OLrzqt;
    public final InterfaceC56387yDm copydefault;

    public C32272mVw(@NotNull android.content.Context context, @NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = context;
        this.OLrzqt = json;
        this.KWHzl = coroutineDispatcher;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mVt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32272mVw.EZpvd(this.KWHzl);
            }
        });
    }

    public final android.content.SharedPreferences KWHzl() {
        return (android.content.SharedPreferences) this.copydefault.getValue();
    }

    public static final android.content.SharedPreferences EZpvd(C32272mVw c32272mVw) {
        return c32272mVw.AEQbTJ.getSharedPreferences("DexMarket", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull SerializationStrategy<? super T> serializationStrategy, T t, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        DexSpRepo$putObject$1 dexSpRepo$putObject$1;
        if (continuation instanceof DexSpRepo$putObject$1) {
            dexSpRepo$putObject$1 = (DexSpRepo$putObject$1) continuation;
            int i = dexSpRepo$putObject$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexSpRepo$putObject$1.label = i - Integer.MIN_VALUE;
            } else {
                dexSpRepo$putObject$1 = new DexSpRepo$putObject$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dexSpRepo$putObject$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexSpRepo$putObject$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            DexSpRepo$putObjectBWLJW6A$$inlined$dexRunCatching$1 dexSpRepo$putObjectBWLJW6A$$inlined$dexRunCatching$1 = new DexSpRepo$putObjectBWLJW6A$$inlined$dexRunCatching$1(null, this, str, serializationStrategy, t);
            dexSpRepo$putObject$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dexSpRepo$putObjectBWLJW6A$$inlined$dexRunCatching$1, dexSpRepo$putObject$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull DeserializationStrategy<? extends T> deserializationStrategy, @NotNull Continuation<? super Result<? extends T>> continuation) throws java.lang.Throwable {
        DexSpRepo$getObject$1 dexSpRepo$getObject$1;
        if (continuation instanceof DexSpRepo$getObject$1) {
            dexSpRepo$getObject$1 = (DexSpRepo$getObject$1) continuation;
            int i = dexSpRepo$getObject$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexSpRepo$getObject$1.label = i - Integer.MIN_VALUE;
            } else {
                dexSpRepo$getObject$1 = new DexSpRepo$getObject$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dexSpRepo$getObject$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexSpRepo$getObject$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            DexSpRepo$getObject0E7RQCE$$inlined$dexRunCatching$1 dexSpRepo$getObject0E7RQCE$$inlined$dexRunCatching$1 = new DexSpRepo$getObject0E7RQCE$$inlined$dexRunCatching$1(null, this, str, deserializationStrategy);
            dexSpRepo$getObject$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dexSpRepo$getObject0E7RQCE$$inlined$dexRunCatching$1, dexSpRepo$getObject$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
