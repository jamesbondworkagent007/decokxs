package o;

import com.amplitude.android.storage.AndroidStorageV2$writeEvent$1;
import com.amplitude.common.Logger;
import com.amplitude.core.Storage;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class JM implements Storage, KO {
    public final java.util.Map<java.lang.String, yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit>> AEQbTJ;
    public final android.content.SharedPreferences EZpvd;
    public final Logger KWHzl;
    public final KM OLrzqt;

    public JM(@NotNull java.lang.String str, @NotNull Logger logger, @NotNull android.content.SharedPreferences sharedPreferences, @NotNull java.io.File file, @NotNull KL kl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(kl, "");
        this.KWHzl = logger;
        this.EZpvd = sharedPreferences;
        this.OLrzqt = new KM(file, str, new JR(sharedPreferences), logger, kl);
        this.AEQbTJ = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplitude.core.Storage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C5242Ke c5242Ke, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AndroidStorageV2$writeEvent$1 androidStorageV2$writeEvent$1;
        JM jm;
        java.lang.String strAubY;
        if (continuation instanceof AndroidStorageV2$writeEvent$1) {
            androidStorageV2$writeEvent$1 = (AndroidStorageV2$writeEvent$1) continuation;
            int i = androidStorageV2$writeEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidStorageV2$writeEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                androidStorageV2$writeEvent$1 = new AndroidStorageV2$writeEvent$1(this, continuation);
            }
        }
        java.lang.Object obj = androidStorageV2$writeEvent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = androidStorageV2$writeEvent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            KM km = this.OLrzqt;
            java.lang.String strOLrzqt = KW.KWHzl.OLrzqt(c5242Ke);
            androidStorageV2$writeEvent$1.L$0 = this;
            androidStorageV2$writeEvent$1.L$1 = c5242Ke;
            androidStorageV2$writeEvent$1.label = 1;
            if (km.EZpvd(strOLrzqt, androidStorageV2$writeEvent$1) == objCopydefault) {
                return objCopydefault;
            }
            jm = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5242Ke = (C5242Ke) androidStorageV2$writeEvent$1.L$1;
            jm = (JM) androidStorageV2$writeEvent$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit> yhoIsConnected = c5242Ke.isConnected();
        if (yhoIsConnected != null && (strAubY = c5242Ke.AubY()) != null) {
            jm.AEQbTJ.put(strAubY, yhoIsConnected);
        }
        return Unit.INSTANCE;
    }

    @Override // com.amplitude.core.Storage
    public java.lang.Object EZpvd(@NotNull Storage.Constants constants, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        this.EZpvd.edit().putString(constants.getRawVal(), str).apply();
        return Unit.INSTANCE;
    }

    public java.lang.Object KWHzl(@NotNull Storage.Constants constants, @NotNull Continuation<? super Unit> continuation) {
        this.EZpvd.edit().remove(constants.getRawVal()).apply();
        return Unit.INSTANCE;
    }

    @Override // com.amplitude.core.Storage, o.KO
    public java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = this.OLrzqt.KWHzl(continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    @Override // com.amplitude.core.Storage
    public java.lang.String copydefault(@NotNull Storage.Constants constants) {
        Intrinsics.checkNotNullParameter(constants, "");
        return this.EZpvd.getString(constants.getRawVal(), null);
    }

    @Override // com.amplitude.core.Storage, o.KO
    public java.util.List<java.lang.Object> OLrzqt() {
        return this.OLrzqt.EZpvd();
    }

    @Override // o.KO
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.EZpvd(str);
    }

    @Override // com.amplitude.core.Storage, o.KO
    public java.lang.Object EZpvd(@NotNull java.lang.Object obj, @NotNull Continuation<? super java.lang.String> continuation) {
        KM km = this.OLrzqt;
        Intrinsics.copydefault(obj, "");
        return km.copydefault((java.lang.String) obj, continuation);
    }

    @Override // com.amplitude.core.Storage
    public InterfaceC5274Lk copydefault(@NotNull C5255Kr c5255Kr, @NotNull C5244Kg c5244Kg, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c5255Kr, "");
        Intrinsics.checkNotNullParameter(c5244Kg, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new KS(this, c5255Kr, c5244Kg, coroutineScope, coroutineDispatcher, this.KWHzl);
    }

    @Override // o.KO
    public boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.OLrzqt(str);
    }

    @Override // o.KO
    public yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.get(str);
    }

    @Override // o.KO
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.remove(str);
    }

    @Override // o.KO
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jSONArray, "");
        this.OLrzqt.copydefault(str, jSONArray);
    }

    public final void AEQbTJ() {
        this.OLrzqt.OLrzqt();
    }
}
