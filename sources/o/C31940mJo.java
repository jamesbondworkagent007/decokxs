package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: renamed from: o.mJo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31940mJo extends AbstractC33073mpa {
    public final MutableLiveData<C32989mnw<Unit>> EZpvd;
    public final Json copydefault = JsonKt.Json$default(null, new Function1() { // from class: o.mJt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C31940mJo.copydefault((JsonBuilder) obj);
        }
    }, 1, null);
    public final LiveData<C32989mnw<Unit>> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> AEQbTJ() {
        return this.djBIcL;
    }

    public C31940mJo() {
        MutableLiveData<C32989mnw<Unit>> mutableLiveData = new MutableLiveData<>();
        this.EZpvd = mutableLiveData;
        this.djBIcL = mutableLiveData;
    }

    public static final Unit copydefault(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(false);
        jsonBuilder.setEncodeDefaults(false);
        return Unit.INSTANCE;
    }
}
