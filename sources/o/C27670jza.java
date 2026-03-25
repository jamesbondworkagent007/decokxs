package o;

import com.okinc.business.market.data.sp.DexSpRepo$getObject$1;
import com.okinc.business.market.data.sp.DexSpRepo$getObject0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.data.sp.DexSpRepo$putObject$1;
import com.okinc.business.market.data.sp.DexSpRepo$putObjectBWLJW6A$$inlined$dexRunCatching$1;
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

/* JADX INFO: renamed from: o.jza, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27670jza {
    public final Json AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final android.content.Context KWHzl;
    public final CoroutineDispatcher OLrzqt;

    public C27670jza(@NotNull android.content.Context context, @NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = context;
        this.AEQbTJ = json;
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jzb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27670jza.OLrzqt(this.copydefault);
            }
        });
    }

    public final android.content.SharedPreferences KWHzl() {
        return (android.content.SharedPreferences) this.EZpvd.getValue();
    }

    public static final android.content.SharedPreferences OLrzqt(C27670jza c27670jza) {
        return c27670jza.KWHzl.getSharedPreferences("DexMarket", 0);
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
    public final <T> java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull DeserializationStrategy<? extends T> deserializationStrategy, @NotNull Continuation<? super Result<? extends T>> continuation) throws java.lang.Throwable {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
