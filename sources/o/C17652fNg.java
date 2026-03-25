package o;

import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes;
import com.okinc.business.defi.wallet.passkey.common.usecase.CreateUopUseCase$invoke$1;
import com.okinc.business.defi.wallet.passkey.common.usecase.CreateUopUseCase$invoke$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17652fNg<T> {
    public final C13934dbu EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final CoroutineDispatcher copydefault;

    public C17652fNg(@NotNull C13934dbu c13934dbu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c13934dbu;
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.fNh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17652fNg.AEQbTJ();
            }
        });
    }

    public final Json copydefault() {
        return (Json) this.OLrzqt.getValue();
    }

    public static final Json AEQbTJ() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.fNd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17652fNg.EZpvd((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull SerializationStrategy<? super T> serializationStrategy, T t, @NotNull Continuation<? super Result<PasskeyWalletCreateUopRes>> continuation) throws java.lang.Throwable {
        CreateUopUseCase$invoke$1 createUopUseCase$invoke$1;
        C13934dbu c13934dbu;
        if (continuation instanceof CreateUopUseCase$invoke$1) {
            createUopUseCase$invoke$1 = (CreateUopUseCase$invoke$1) continuation;
            int i = createUopUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createUopUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createUopUseCase$invoke$1 = new CreateUopUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = createUopUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = createUopUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbu2 = this.EZpvd;
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            CreateUopUseCase$invoke$2 createUopUseCase$invoke$2 = new CreateUopUseCase$invoke$2(this, serializationStrategy, t, null);
            createUopUseCase$invoke$1.L$0 = c13934dbu2;
            createUopUseCase$invoke$1.L$1 = str;
            createUopUseCase$invoke$1.label = 1;
            java.lang.Object objWithContext = BuildersKt.withContext(coroutineDispatcher, createUopUseCase$invoke$2, createUopUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            obj = objWithContext;
            c13934dbu = c13934dbu2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            str = (java.lang.String) createUopUseCase$invoke$1.L$1;
            c13934dbu = (C13934dbu) createUopUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        createUopUseCase$invoke$1.L$0 = null;
        createUopUseCase$invoke$1.L$1 = null;
        createUopUseCase$invoke$1.label = 2;
        java.lang.Object objOLrzqt = c13934dbu.OLrzqt(str, (JsonElement) obj, createUopUseCase$invoke$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }
}
