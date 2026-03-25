package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.BufferType;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Paint {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final long EZpvd;
    public final java.util.List<java.lang.String> KWHzl;
    public final java.lang.String OLrzqt;
    public final java.util.List<BufferType> copydefault;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 long)
  (r6v0 java.lang.String)
  (r7v0 java.util.List)
  (r8v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] call: o.Paint.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Paint(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, java.util.List list, java.lang.String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, str4, list, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BufferType> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    public Paint(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, java.util.List<java.lang.String> list, java.lang.String str5) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = str;
        this.AhwBna = str2;
        this.gEmmrt = str3;
        this.EZpvd = j;
        this.OLrzqt = str4;
        this.KWHzl = list;
        this.AEQbTJ = str5;
        if (list != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (final java.lang.String str6 : list) {
                arrayList.add(BufferType.EZpvd.EZpvd(new Function1<BufferType.Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.AssumeRoleWithWebIdentityParameters$convertedPolicyArns$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BufferType.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull BufferType.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                        activity.OLrzqt(str6);
                    }
                }));
            }
        } else {
            arrayList = null;
        }
        this.copydefault = arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Paint(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, java.util.List list, java.lang.String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jEZpvd;
        java.lang.String str6 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            jEZpvd = C59519zia.EZpvd(900, DurationUnit.SECONDS);
        } else {
            jEZpvd = j;
        }
        this(str, str2, str6, jEZpvd, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5, null);
    }
}
