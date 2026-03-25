package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.BufferType;
import o.C59462zhW;
import o.Toast;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Matrix {
    public final java.util.List<Toast> AEQbTJ;
    public final java.util.List<java.lang.String> AYXKKw;
    public final java.lang.String AhwBna;
    public final java.util.List<java.lang.String> AkhnZx;
    public final long EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<BufferType> OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.util.Map<java.lang.String, java.lang.String> fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 long)
  (r6v0 java.util.List)
  (r7v0 java.lang.String)
  (r8v0 java.util.Map)
  (r9v0 java.util.List)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, java.util.List<java.lang.String>, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String):void (m)] call: o.Matrix.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.util.List, java.lang.String, java.util.Map, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Matrix(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.util.List list, java.lang.String str4, java.util.Map map, java.util.List list2, java.lang.String str5, java.lang.String str6, java.lang.String str7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, list, str4, map, list2, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Toast> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BufferType> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    public Matrix(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.util.List<java.lang.String> list, java.lang.String str4, java.util.Map<java.lang.String, java.lang.String> map, java.util.List<java.lang.String> list2, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        this.djBIcL = str2;
        this.copydefault = str3;
        this.EZpvd = j;
        this.AYXKKw = list;
        this.KWHzl = str4;
        this.fetchVPNInfo = map;
        this.AkhnZx = list2;
        this.AhwBna = str5;
        this.isConnected = str6;
        this.gEmmrt = str7;
        java.util.ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (final java.lang.String str8 : list) {
                arrayList.add(BufferType.EZpvd.EZpvd(new Function1<BufferType.Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.AssumeRoleParameters$convertedPolicyArns$1$1
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
                        activity.OLrzqt(str8);
                    }
                }));
            }
        } else {
            arrayList = null;
        }
        this.OLrzqt = arrayList;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.fetchVPNInfo;
        if (map2 != null) {
            arrayList2 = new java.util.ArrayList(map2.size());
            for (final Map.Entry<java.lang.String, java.lang.String> entry : map2.entrySet()) {
                arrayList2.add(Toast.copydefault.copydefault(new Function1<Toast.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.AssumeRoleParameters$convertedTags$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Toast.StateListAnimator stateListAnimator) {
                        invoke2(stateListAnimator);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Toast.StateListAnimator stateListAnimator) {
                        Intrinsics.checkNotNullParameter(stateListAnimator, "");
                        stateListAnimator.KWHzl(entry.getKey());
                        stateListAnimator.EZpvd(entry.getValue());
                    }
                }));
            }
        }
        this.AEQbTJ = arrayList2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Matrix(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.util.List list, java.lang.String str4, java.util.Map map, java.util.List list2, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jEZpvd;
        java.lang.String str8 = (i & 2) != 0 ? null : str2;
        java.lang.String str9 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            jEZpvd = C59519zia.EZpvd(900, DurationUnit.SECONDS);
        } else {
            jEZpvd = j;
        }
        this(str, str8, str9, jEZpvd, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : map, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, null);
    }
}
