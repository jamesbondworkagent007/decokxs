package o;

import com.amplitude.common.Logger;
import com.amplitude.core.Storage;
import com.amplitude.core.utilities.FileStorage$writeEvent$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes21.dex */
public final class KV implements Storage, KO {
    public static final Application Companion = new Application(null);
    public final MO AEQbTJ;
    public final KM EZpvd;
    public final java.util.Map<java.lang.String, yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit>> OLrzqt;
    public final Logger copydefault;

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.KV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplitude.core.Storage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C5242Ke c5242Ke, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        FileStorage$writeEvent$1 fileStorage$writeEvent$1;
        KV kv;
        java.lang.String strAubY;
        if (continuation instanceof FileStorage$writeEvent$1) {
            fileStorage$writeEvent$1 = (FileStorage$writeEvent$1) continuation;
            int i = fileStorage$writeEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fileStorage$writeEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                fileStorage$writeEvent$1 = new FileStorage$writeEvent$1(this, continuation);
            }
        }
        java.lang.Object obj = fileStorage$writeEvent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fileStorage$writeEvent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            KM km = this.EZpvd;
            java.lang.String strOLrzqt = KW.KWHzl.OLrzqt(c5242Ke);
            fileStorage$writeEvent$1.L$0 = this;
            fileStorage$writeEvent$1.L$1 = c5242Ke;
            fileStorage$writeEvent$1.label = 1;
            if (km.EZpvd(strOLrzqt, fileStorage$writeEvent$1) == objCopydefault) {
                return objCopydefault;
            }
            kv = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5242Ke = (C5242Ke) fileStorage$writeEvent$1.L$1;
            kv = (KV) fileStorage$writeEvent$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit> yhoIsConnected = c5242Ke.isConnected();
        if (yhoIsConnected != null && (strAubY = c5242Ke.AubY()) != null) {
            kv.OLrzqt.put(strAubY, yhoIsConnected);
        }
        return Unit.INSTANCE;
    }

    @Override // com.amplitude.core.Storage
    public java.lang.Object EZpvd(@NotNull Storage.Constants constants, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        this.AEQbTJ.EZpvd(constants.getRawVal(), str);
        return Unit.INSTANCE;
    }

    @Override // com.amplitude.core.Storage, o.KO
    public java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = this.EZpvd.KWHzl(continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    @Override // com.amplitude.core.Storage
    public java.lang.String copydefault(@NotNull Storage.Constants constants) {
        Intrinsics.checkNotNullParameter(constants, "");
        return this.AEQbTJ.copydefault(constants.getRawVal(), null);
    }

    @Override // com.amplitude.core.Storage, o.KO
    public java.util.List<java.lang.Object> OLrzqt() {
        return this.EZpvd.EZpvd();
    }

    @Override // o.KO
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.EZpvd(str);
    }

    @Override // com.amplitude.core.Storage, o.KO
    public java.lang.Object EZpvd(@NotNull java.lang.Object obj, @NotNull Continuation<? super java.lang.String> continuation) {
        KM km = this.EZpvd;
        Intrinsics.copydefault(obj, "");
        return km.copydefault((java.lang.String) obj, continuation);
    }

    @Override // com.amplitude.core.Storage
    public InterfaceC5274Lk copydefault(@NotNull C5255Kr c5255Kr, @NotNull C5244Kg c5244Kg, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c5255Kr, "");
        Intrinsics.checkNotNullParameter(c5244Kg, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new KS(this, c5255Kr, c5244Kg, coroutineScope, coroutineDispatcher, this.copydefault);
    }

    @Override // o.KO
    public boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.OLrzqt(str);
    }

    @Override // o.KO
    public yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.getOrDefault(str, null);
    }

    @Override // o.KO
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.remove(str);
    }

    @Override // o.KO
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jSONArray, "");
        this.EZpvd.copydefault(str, jSONArray);
    }
}
