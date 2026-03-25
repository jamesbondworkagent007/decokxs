package com.okinc.okimcore.model.utility;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C33489mxS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ContactExtField {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String enNickName;
    private final boolean isOpenKOL;
    private final String kolUniqueName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContactExtField() {
        this(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContactExtField copy$default(ContactExtField contactExtField, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = contactExtField.isOpenKOL;
        }
        if ((i & 2) != 0) {
            str = contactExtField.kolUniqueName;
        }
        if ((i & 4) != 0) {
            str2 = contactExtField.enNickName;
        }
        return contactExtField.copy(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isOpenKOL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.kolUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.enNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactExtField copy(boolean z, String str, String str2) {
        return new ContactExtField(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactExtField)) {
            return false;
        }
        ContactExtField contactExtField = (ContactExtField) obj;
        return this.isOpenKOL == contactExtField.isOpenKOL && Intrinsics.EZpvd((Object) this.kolUniqueName, (Object) contactExtField.kolUniqueName) && Intrinsics.EZpvd((Object) this.enNickName, (Object) contactExtField.enNickName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnNickName() {
        return this.enNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKolUniqueName() {
        return this.kolUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isOpenKOL);
        String str = this.kolUniqueName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.enNickName;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOpenKOL() {
        return this.isOpenKOL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContactExtField(isOpenKOL=" + this.isOpenKOL + ", kolUniqueName=" + this.kolUniqueName + ", enNickName=" + this.enNickName + ")";
    }

    public /* synthetic */ ContactExtField(int i, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.isOpenKOL = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.kolUniqueName = null;
        } else {
            this.kolUniqueName = str;
        }
        if ((i & 4) == 0) {
            this.enNickName = null;
        } else {
            this.enNickName = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ContactExtField contactExtField, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || contactExtField.isOpenKOL) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, contactExtField.isOpenKOL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || contactExtField.kolUniqueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, contactExtField.kolUniqueName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && contactExtField.enNickName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, contactExtField.enNickName);
    }

    public ContactExtField(boolean z, String str, String str2) {
        this.isOpenKOL = z;
        this.kolUniqueName = str;
        this.enNickName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.okimcore.model.utility.ContactExtField.<init>(boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ContactExtField(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final String toJson() {
        try {
            return C33489mxS.KWHzl.KWHzl(Companion.serializer(), this);
        } catch (Exception unused) {
            return "";
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.utility.ContactExtField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ContactExtField> serializer() {
            return ContactExtField$$serializer.INSTANCE;
        }

        public final ContactExtField KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                try {
                    return (ContactExtField) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) serializer(), str);
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public final ContactExtField KWHzl(Boolean bool, String str, String str2) {
            return new ContactExtField(Intrinsics.EZpvd(Boolean.TRUE, bool), str, str2);
        }
    }
}
