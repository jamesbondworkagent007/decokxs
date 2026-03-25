package o;

import aws.sdk.kotlin.runtime.auth.credentials.ProfileBearerTokenProvider$resolve$1;
import aws.sdk.kotlin.runtime.auth.credentials.ProfileBearerTokenProvider$sharedConfig$1;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5148Go;
import o.InterfaceC5168Hi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Parcelable implements InterfaceC3073Af {
    public final InterfaceC3972Aw AEQbTJ;
    public final HL EZpvd;
    public final java.lang.String KWHzl;
    public final HH<ObjectOutputStream> OLrzqt;
    public final InterfaceC5168Hi copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Parcelable() {
        this(null, null, null, null, 15, null);
    }

    public Parcelable(java.lang.String str, @NotNull HL hl, InterfaceC3972Aw interfaceC3972Aw, @NotNull InterfaceC5168Hi interfaceC5168Hi) {
        Intrinsics.checkNotNullParameter(hl, "");
        Intrinsics.checkNotNullParameter(interfaceC5168Hi, "");
        this.KWHzl = str;
        this.EZpvd = hl;
        this.AEQbTJ = interfaceC3972Aw;
        this.copydefault = interfaceC5168Hi;
        this.OLrzqt = HE.AEQbTJ(new ProfileBearerTokenProvider$sharedConfig$1(this, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:o.HL:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HL:0x000c: INVOKE (wrap:o.HL$TaskDescription:0x000a: SGET  A[WRAPPED] (LINE:59) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:59)) : (r3v0 o.HL))
  (wrap:o.Aw:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.Aw) : (r4v0 o.Aw))
  (wrap:o.Hi:?: TERNARY null = ((wrap:int:0x0015: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.Hi:0x0019: SGET  A[WRAPPED] (LINE:61) o.Hi.Activity.AEQbTJ o.Hi$Activity) : (r5v0 o.Hi))
 A[MD:(java.lang.String, o.HL, o.Aw, o.Hi):void (m)] (LINE:57) call: o.Parcelable.<init>(java.lang.String, o.HL, o.Aw, o.Hi):void type: THIS */
    public /* synthetic */ Parcelable(java.lang.String str, HL hl, InterfaceC3972Aw interfaceC3972Aw, InterfaceC5168Hi interfaceC5168Hi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? HL.OLrzqt.copydefault() : hl, (i & 4) != 0 ? null : interfaceC3972Aw, (i & 8) != 0 ? InterfaceC5168Hi.Activity.AEQbTJ : interfaceC5168Hi);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC3073Af, o.InterfaceC5045Cp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super zZ> continuation) throws java.lang.Throwable {
        ProfileBearerTokenProvider$resolve$1 profileBearerTokenProvider$resolve$1;
        Parcelable parcelable;
        InterfaceC57843yq interfaceC57843yq2;
        InterfaceC5148Go interfaceC5148Go;
        if (continuation instanceof ProfileBearerTokenProvider$resolve$1) {
            profileBearerTokenProvider$resolve$1 = (ProfileBearerTokenProvider$resolve$1) continuation;
            int i = profileBearerTokenProvider$resolve$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                profileBearerTokenProvider$resolve$1.label = i - Integer.MIN_VALUE;
            } else {
                profileBearerTokenProvider$resolve$1 = new ProfileBearerTokenProvider$resolve$1(this, continuation);
            }
        }
        java.lang.Object objResolve = profileBearerTokenProvider$resolve$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = profileBearerTokenProvider$resolve$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objResolve);
            CoroutineContext context = profileBearerTokenProvider$resolve$1.getContext();
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(Parcelable.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
            HH<ObjectOutputStream> hh = this.OLrzqt;
            profileBearerTokenProvider$resolve$1.L$0 = this;
            profileBearerTokenProvider$resolve$1.L$1 = interfaceC57843yq;
            profileBearerTokenProvider$resolve$1.L$2 = interfaceC5148GoOLrzqt;
            profileBearerTokenProvider$resolve$1.label = 1;
            java.lang.Object objKWHzl = hh.KWHzl(profileBearerTokenProvider$resolve$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            parcelable = this;
            interfaceC57843yq2 = interfaceC57843yq;
            interfaceC5148Go = interfaceC5148GoOLrzqt;
            objResolve = objKWHzl;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objResolve);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC5148Go = (InterfaceC5148Go) profileBearerTokenProvider$resolve$1.L$2;
            interfaceC57843yq2 = (InterfaceC57843yq) profileBearerTokenProvider$resolve$1.L$1;
            parcelable = (Parcelable) profileBearerTokenProvider$resolve$1.L$0;
            C56391yDq.AEQbTJ(objResolve);
        }
        final ObjectOutputStream objectOutputStream = (ObjectOutputStream) objResolve;
        InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ProfileBearerTokenProvider$resolve$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Loading bearer token from profile `" + objectOutputStream.OLrzqt().OLrzqt() + '`';
            }
        }, 1, null);
        InterfaceC3073Af interfaceC3073AfAEQbTJ = parcelable.AEQbTJ(objectOutputStream);
        profileBearerTokenProvider$resolve$1.L$0 = null;
        profileBearerTokenProvider$resolve$1.L$1 = null;
        profileBearerTokenProvider$resolve$1.L$2 = null;
        profileBearerTokenProvider$resolve$1.label = 2;
        objResolve = interfaceC3073AfAEQbTJ.resolve(interfaceC57843yq2, profileBearerTokenProvider$resolve$1);
        return objResolve == objCopydefault ? objCopydefault : objResolve;
    }

    public final InterfaceC3073Af AEQbTJ(ObjectOutputStream objectOutputStream) {
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default(objectOutputStream.OLrzqt(), "sso_session", null, 2, null);
        if (orNull$default == null) {
            throw new ProviderConfigurationException("no bearer token providers available for profile `" + objectOutputStream.OLrzqt().OLrzqt() + '`', null, 2, null);
        }
        ObjectStreamField objectStreamField = objectOutputStream.AEQbTJ().get(orNull$default);
        if (objectStreamField == null) {
            throw new ProviderConfigurationException("profile (" + objectOutputStream.OLrzqt().OLrzqt() + ") references non-existing sso_session = `" + orNull$default + '`', null, 2, null);
        }
        java.lang.String orNull$default2 = ObjectStreamField.getOrNull$default(objectStreamField, "sso_start_url", null, 2, null);
        if (orNull$default2 == null) {
            throw new ProviderConfigurationException("sso-session (" + orNull$default + ") missing `sso_start_url`", null, 2, null);
        }
        java.lang.String orNull$default3 = ObjectStreamField.getOrNull$default(objectStreamField, "sso_region", null, 2, null);
        if (orNull$default3 == null) {
            throw new ProviderConfigurationException("sso-session (" + orNull$default + ") missing `sso_region`", null, 2, null);
        }
        return new Editable(orNull$default, orNull$default2, orNull$default3, 0L, this.AEQbTJ, this.EZpvd, this.copydefault, 8, null);
    }
}
