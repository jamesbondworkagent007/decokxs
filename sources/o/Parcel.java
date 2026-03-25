package o;

import android.support.v4.media.session.PlaybackStateCompat;
import aws.sdk.kotlin.runtime.auth.credentials.ProcessCredentialsProvider$resolve$1;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5148Go;
import o.InterfaceC5168Hi;
import o.LocaleList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Parcel implements InterfaceC52805wZ {
    public final long AEQbTJ;
    public final HL EZpvd;
    public final long KWHzl;
    public final java.lang.String OLrzqt;

    public Parcel(@NotNull java.lang.String str, @NotNull HL hl, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hl, "");
        this.OLrzqt = str;
        this.EZpvd = hl;
        this.KWHzl = j;
        this.AEQbTJ = j2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:o.HL:0x000a: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HL:0x0006: INVOKE (wrap:o.HL$TaskDescription:0x0004: SGET  A[WRAPPED] (LINE:48) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:48)) : (r9v0 o.HL))
  (wrap:long:0x0012: TERNARY null = ((wrap:int:0x000b: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x000f: SGET  A[WRAPPED] android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH long) : (r10v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (60000 long) : (r12v0 long))
 A[MD:(java.lang.String, o.HL, long, long):void (m)] (LINE:46) call: o.Parcel.<init>(java.lang.String, o.HL, long, long):void type: THIS */
    public /* synthetic */ Parcel(java.lang.String str, HL hl, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? HL.OLrzqt.copydefault() : hl, (i & 4) != 0 ? PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH : j, (i & 8) != 0 ? 60000L : j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) throws java.lang.Throwable {
        ProcessCredentialsProvider$resolve$1 processCredentialsProvider$resolve$1;
        InterfaceC5148Go interfaceC5148Go;
        if (continuation instanceof ProcessCredentialsProvider$resolve$1) {
            processCredentialsProvider$resolve$1 = (ProcessCredentialsProvider$resolve$1) continuation;
            int i = processCredentialsProvider$resolve$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processCredentialsProvider$resolve$1.label = i - Integer.MIN_VALUE;
            } else {
                processCredentialsProvider$resolve$1 = new ProcessCredentialsProvider$resolve$1(this, continuation);
            }
        }
        ProcessCredentialsProvider$resolve$1 processCredentialsProvider$resolve$12 = processCredentialsProvider$resolve$1;
        java.lang.Object obj = processCredentialsProvider$resolve$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = processCredentialsProvider$resolve$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineContext context = processCredentialsProvider$resolve$12.getContext();
                java.lang.String strGEmmrt = C56524yIo.AEQbTJ(Parcel.class).gEmmrt();
                if (strGEmmrt == null) {
                    throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
                }
                InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
                java.lang.String str = this.OLrzqt;
                HL hl = this.EZpvd;
                long j = this.KWHzl;
                long j2 = this.AEQbTJ;
                processCredentialsProvider$resolve$12.L$0 = interfaceC5148GoOLrzqt;
                processCredentialsProvider$resolve$12.label = 1;
                java.lang.Object objKWHzl = Handler.KWHzl(str, hl, j, j2, (16 & 16) != 0 ? InterfaceC5168Hi.Activity.AEQbTJ : null, processCredentialsProvider$resolve$12);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC5148Go = interfaceC5148GoOLrzqt;
                obj = objKWHzl;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC5148Go = (InterfaceC5148Go) processCredentialsProvider$resolve$12.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            kotlin.Pair pair = (kotlin.Pair) obj;
            final int iIntValue = ((java.lang.Number) pair.component1()).intValue();
            final java.lang.String str2 = (java.lang.String) pair.component2();
            if (iIntValue != 0) {
                InterfaceC5148Go.TaskDescription.warn$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ProcessCredentialsProvider$resolve$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Command completed with nonzero exit code " + iIntValue + ": " + str2;
                    }
                }, 1, null);
                throw new CredentialsProviderException("Command completed with nonzero exit code " + iIntValue + ": " + str2, null, 2, null);
            }
            LocaleList localeListEZpvd = Creator.EZpvd(new EL(C59449zhJ.getNewProxyInstance(str2)));
            if (localeListEZpvd instanceof LocaleList.TaskDescription) {
                LocaleList.TaskDescription taskDescription = (LocaleList.TaskDescription) localeListEZpvd;
                java.lang.String strKWHzl = taskDescription.KWHzl();
                java.lang.String strCopydefault = taskDescription.copydefault();
                java.lang.String strEZpvd = taskDescription.EZpvd();
                C5173Hn c5173HnAEQbTJ = taskDescription.AEQbTJ();
                if (c5173HnAEQbTJ == null) {
                    c5173HnAEQbTJ = C5173Hn.AEQbTJ.OLrzqt();
                }
                return Spanned.AEQbTJ(strKWHzl, strCopydefault, strEZpvd, c5173HnAEQbTJ, "Process", taskDescription.OLrzqt());
            }
            throw new CredentialsProviderException("Credentials response was not of expected format", null, 2, null);
        } catch (java.lang.Exception e) {
            throw new CredentialsProviderException("Failed to execute command", e);
        }
    }
}
