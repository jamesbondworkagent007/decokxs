package o;

import com.immomo.mls.fun.ud.UDNativeLoader;
import com.okinc.wallet.mln.api.NFTApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C57248yeo {
    public static final ActionBar Companion = new ActionBar(null);
    public static final InterfaceC56387yDm<Json> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.yet
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57248yeo.valueOf();
        }
    });
    public static final InterfaceC56387yDm<OkHttpClient> OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.yew
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57248yeo.KWHzl();
        }
    });
    public static final InterfaceC56387yDm<C13927dbn> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.yeu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57248yeo.AYXKKw();
        }
    });

    /* JADX INFO: renamed from: o.yeo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yeo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C13927dbn OLrzqt() {
            return (C13927dbn) C57248yeo.copydefault.getValue();
        }
    }

    public static final Json valueOf() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.yex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57248yeo.copydefault((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(false);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        return Unit.INSTANCE;
    }

    public static final OkHttpClient KWHzl() {
        return new OkHttpClient().newBuilder().build();
    }

    public static final C13927dbn AYXKKw() {
        return new C13927dbn();
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final UDNativeLoader.Application application, @NotNull final UDNativeLoader.Activity activity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(activity, "");
        return C33024moe.subscribeOnIO$default(NFTApiService.Application.postRequest$default((NFTApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(NFTApiService.class), Companion.OLrzqt()), str, Json.Default.parseToJsonElement(str2), null, 4, null), new Function1() { // from class: o.yer
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57248yeo.KWHzl(activity, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.yev
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57248yeo.KWHzl(application, (JsonObject) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit KWHzl(UDNativeLoader.Application application, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        application.copydefault(jsonObject);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(UDNativeLoader.Activity activity, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        activity.KWHzl(-1, th.getMessage());
        return Unit.INSTANCE;
    }
}
