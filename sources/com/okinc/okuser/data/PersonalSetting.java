package com.okinc.okuser.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PersonalSetting {
    private int chargeUnit;
    private int colorPalette;
    private int upDownColor;
    private int upDownTimeZone;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PersonalSetting() {
        this(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PersonalSetting copy$default(PersonalSetting personalSetting, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = personalSetting.chargeUnit;
        }
        if ((i5 & 2) != 0) {
            i2 = personalSetting.upDownColor;
        }
        if ((i5 & 4) != 0) {
            i3 = personalSetting.upDownTimeZone;
        }
        if ((i5 & 8) != 0) {
            i4 = personalSetting.colorPalette;
        }
        return personalSetting.copy(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.chargeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.upDownColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.upDownTimeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.colorPalette;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PersonalSetting copy(int i, int i2, int i3, int i4) {
        return new PersonalSetting(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalSetting)) {
            return false;
        }
        PersonalSetting personalSetting = (PersonalSetting) obj;
        return this.chargeUnit == personalSetting.chargeUnit && this.upDownColor == personalSetting.upDownColor && this.upDownTimeZone == personalSetting.upDownTimeZone && this.colorPalette == personalSetting.colorPalette;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChargeUnit() {
        return this.chargeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getColorPalette() {
        return this.colorPalette;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUpDownColor() {
        return this.upDownColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUpDownTimeZone() {
        return this.upDownTimeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.chargeUnit) * 31) + Integer.hashCode(this.upDownColor)) * 31) + Integer.hashCode(this.upDownTimeZone)) * 31) + Integer.hashCode(this.colorPalette);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChargeUnit(int i) {
        this.chargeUnit = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColorPalette(int i) {
        this.colorPalette = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpDownColor(int i) {
        this.upDownColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpDownTimeZone(int i) {
        this.upDownTimeZone = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PersonalSetting(chargeUnit=" + this.chargeUnit + ", upDownColor=" + this.upDownColor + ", upDownTimeZone=" + this.upDownTimeZone + ", colorPalette=" + this.colorPalette + ")";
    }

    public /* synthetic */ PersonalSetting(int i, int i2, int i3, int i4, int i5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chargeUnit = 0;
        } else {
            this.chargeUnit = i2;
        }
        if ((i & 2) == 0) {
            this.upDownColor = 0;
        } else {
            this.upDownColor = i3;
        }
        if ((i & 4) == 0) {
            this.upDownTimeZone = 0;
        } else {
            this.upDownTimeZone = i4;
        }
        if ((i & 8) == 0) {
            this.colorPalette = 0;
        } else {
            this.colorPalette = i5;
        }
    }

    public static final /* synthetic */ void write$Self$OKUser_okuser(PersonalSetting personalSetting, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || personalSetting.chargeUnit != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, personalSetting.chargeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || personalSetting.upDownColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, personalSetting.upDownColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || personalSetting.upDownTimeZone != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, personalSetting.upDownTimeZone);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && personalSetting.colorPalette == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, personalSetting.colorPalette);
    }

    public PersonalSetting(int i, int i2, int i3, int i4) {
        this.chargeUnit = i;
        this.upDownColor = i2;
        this.upDownTimeZone = i3;
        this.colorPalette = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(int, int, int, int):void (m)] (LINE:9) call: com.okinc.okuser.data.PersonalSetting.<init>(int, int, int, int):void type: THIS */
    public /* synthetic */ PersonalSetting(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.PersonalSetting.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PersonalSetting> serializer() {
            return PersonalSetting$$serializer.INSTANCE;
        }
    }
}
