package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ReminderInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean needReminder;
    private final String reminderContent;
    private final String reminderTitle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReminderInfo() {
        this(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReminderInfo copy$default(ReminderInfo reminderInfo, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = reminderInfo.needReminder;
        }
        if ((i & 2) != 0) {
            str = reminderInfo.reminderContent;
        }
        if ((i & 4) != 0) {
            str2 = reminderInfo.reminderTitle;
        }
        return reminderInfo.copy(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.needReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.reminderTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReminderInfo copy(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ReminderInfo(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderInfo)) {
            return false;
        }
        ReminderInfo reminderInfo = (ReminderInfo) obj;
        return this.needReminder == reminderInfo.needReminder && Intrinsics.EZpvd((Object) this.reminderContent, (Object) reminderInfo.reminderContent) && Intrinsics.EZpvd((Object) this.reminderTitle, (Object) reminderInfo.reminderTitle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedReminder() {
        return this.needReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReminderContent() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReminderTitle() {
        return this.reminderTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.needReminder) * 31) + this.reminderContent.hashCode()) * 31) + this.reminderTitle.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReminderInfo(needReminder=" + this.needReminder + ", reminderContent=" + this.reminderContent + ", reminderTitle=" + this.reminderTitle + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.ReminderInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReminderInfo> serializer() {
            return ReminderInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReminderInfo(int i, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.needReminder = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.reminderContent = "";
        } else {
            this.reminderContent = str;
        }
        if ((i & 4) == 0) {
            this.reminderTitle = "";
        } else {
            this.reminderTitle = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ReminderInfo reminderInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || reminderInfo.needReminder) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, reminderInfo.needReminder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) reminderInfo.reminderContent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, reminderInfo.reminderContent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) reminderInfo.reminderTitle, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, reminderInfo.reminderTitle);
    }

    public ReminderInfo(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.needReminder = z;
        this.reminderContent = str;
        this.reminderTitle = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String):void (m)] (LINE:1516) call: com.okinc.business.dexlogic.bean.ReminderInfo.<init>(boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ReminderInfo(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
