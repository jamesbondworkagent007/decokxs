package o;

import aws.sdk.kotlin.runtime.auth.credentials.EnvironmentCredentialsProvider$1;
import aws.sdk.kotlin.runtime.auth.credentials.EnvironmentCredentialsProvider$resolve$2;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.BaseBundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Environment implements InterfaceC52805wZ {
    public final Function1<java.lang.String, java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Environment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public Environment(@NotNull Function1<? super java.lang.String, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x000c: CONSTRUCTOR 
  (wrap:o.HL:0x0008: INVOKE (wrap:o.HL$TaskDescription:0x0006: SGET  A[WRAPPED] o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED])
 A[MD:(java.lang.Object):void (m), WRAPPED] (LINE:28) call: aws.sdk.kotlin.runtime.auth.credentials.EnvironmentCredentialsProvider$1.<init>(java.lang.Object):void type: CONSTRUCTOR) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String>):void (m)] (LINE:27) call: o.Environment.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ Environment(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new EnvironmentCredentialsProvider$1(HL.OLrzqt.copydefault()) : function1);
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.String strInvoke = this.copydefault.invoke(str);
        if (strInvoke != null) {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strInvoke))) {
                strInvoke = null;
            }
            if (strInvoke != null) {
                return strInvoke;
            }
        }
        throw new ProviderConfigurationException("Missing value for environment variable `" + str + '`', null, 2, null);
    }

    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) {
        CoroutineContext context = continuation.getContext();
        EnvironmentCredentialsProvider$resolve$2 environmentCredentialsProvider$resolve$2 = new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.EnvironmentCredentialsProvider$resolve$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Attempting to load credentials from env vars " + BaseBundle.EZpvd + JsonPointer.SEPARATOR + BaseBundle.AEQbTJ + JsonPointer.SEPARATOR + BaseBundle.OLrzqt;
            }
        };
        LogLevel logLevel = LogLevel.Trace;
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(Environment.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
        }
        C5141Gh.copydefault(context, logLevel, strGEmmrt, null, environmentCredentialsProvider$resolve$2);
        return Spanned.AEQbTJ(OLrzqt(BaseBundle.EZpvd), OLrzqt(BaseBundle.AEQbTJ), (24 & 4) != 0 ? null : this.copydefault.invoke(BaseBundle.OLrzqt), (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : "Environment", (24 & 32) != 0 ? null : this.copydefault.invoke(BaseBundle.copydefault));
    }
}
