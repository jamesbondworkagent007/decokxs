package com.okinc.planet.biz_setting.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class CurveResetInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final CurveResetInfo Empty = new CurveResetInfo("", "", "");
    public final String curveStartTime;
    public final String initialTime;
    public final String remainNums;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CurveResetInfo copy$default(CurveResetInfo curveResetInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = curveResetInfo.curveStartTime;
        }
        if ((i & 2) != 0) {
            str2 = curveResetInfo.initialTime;
        }
        if ((i & 4) != 0) {
            str3 = curveResetInfo.remainNums;
        }
        return curveResetInfo.KWHzl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurveResetInfo KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CurveResetInfo(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.curveStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.initialTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.remainNums;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurveResetInfo)) {
            return false;
        }
        CurveResetInfo curveResetInfo = (CurveResetInfo) obj;
        return Intrinsics.EZpvd((Object) this.curveStartTime, (Object) curveResetInfo.curveStartTime) && Intrinsics.EZpvd((Object) this.initialTime, (Object) curveResetInfo.initialTime) && Intrinsics.EZpvd((Object) this.remainNums, (Object) curveResetInfo.remainNums);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.curveStartTime.hashCode() * 31) + this.initialTime.hashCode()) * 31) + this.remainNums.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurveResetInfo(curveStartTime=" + this.curveStartTime + ", initialTime=" + this.initialTime + ", remainNums=" + this.remainNums + ")";
    }

    public /* synthetic */ CurveResetInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CurveResetInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.curveStartTime = str;
        this.initialTime = str2;
        this.remainNums = str3;
    }

    public static final /* synthetic */ void AEQbTJ(CurveResetInfo curveResetInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, curveResetInfo.curveStartTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, curveResetInfo.initialTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, curveResetInfo.remainNums);
    }

    public CurveResetInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.curveStartTime = str;
        this.initialTime = str2;
        this.remainNums = str3;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_setting.data.CurveResetInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CurveResetInfo> serializer() {
            return CurveResetInfo$$serializer.INSTANCE;
        }
    }
}
