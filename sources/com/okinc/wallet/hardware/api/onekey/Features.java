package com.okinc.wallet.hardware.api.onekey;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class Features implements Parcelable {
    private final String NFT_voucher;
    private final Boolean _passphrase_cached;
    private final Long auto_lock_delay_ms;
    private final Boolean backup_only;
    private final String backup_type;
    private final Long battery_level;
    private final Boolean ble_enable;
    private final String ble_name;
    private final String ble_ver;
    private final String bootloader_hash;
    private final Boolean bootloader_mode;
    private final String bootloader_version;
    private final String build_id;
    private final List<Integer> capabilities;
    private final Long coin_switch;
    private final String cpu_info;
    private final String device_id;
    private final Long display_rotation;
    private final Boolean experimental_features;
    private final Boolean firmware_present;
    private final Long flags;
    private final Long fw_major;
    private final Long fw_minor;
    private final Long fw_patch;
    private final String fw_vendor;
    private final String fw_vendor_keys;
    private final Boolean imported;
    private final Boolean initialized;
    private final Long initstates;
    private final String label;
    private final String language;
    private final long major_version;
    private final long minor_version;
    private final String model;
    private final Boolean needs_backup;
    private final Boolean no_backup;
    private final Long offset;
    private final String onekey_serial;
    private final String onekey_version;
    private final Boolean passphrase_always_on_device;
    private final Boolean passphrase_protection;
    private final long patch_version;
    private final Boolean pin_protection;
    private final String pre_firmware;
    private final Boolean recovery_mode;
    private final String revision;
    private final String safety_checks;
    private final Boolean sd_card_present;
    private final Boolean sd_protection;
    private final Boolean se_enable;
    private final String se_ver;
    private final String serial_no;
    private final String session_id;
    private final String spi_flash;
    private final Boolean unfinished_backup;
    private final Boolean unlocked;
    private final String vendor;
    private final Boolean wipe_code_protection;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Features> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<Features> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Features createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string2 = parcel.readString();
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Boolean boolValueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf6 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf7 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf8 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf9 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string7 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Boolean boolValueOf10 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf11 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf12 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new Features(string, j, j2, j3, boolValueOf, string2, boolValueOf2, boolValueOf3, string3, string4, boolValueOf4, string5, string6, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, lValueOf, string7, lValueOf2, lValueOf3, lValueOf4, string8, string9, boolValueOf10, boolValueOf11, boolValueOf12, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Features[] newArray(int i) {
            return new Features[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAuto_lock_delay_ms() {
        return this.auto_lock_delay_ms;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getBackup_only() {
        return this.backup_only;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackup_type() {
        return this.backup_type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBattery_level() {
        return this.battery_level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getBle_enable() {
        return this.ble_enable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBle_name() {
        return this.ble_name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBle_ver() {
        return this.ble_ver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBootloader_hash() {
        return this.bootloader_hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getBootloader_mode() {
        return this.bootloader_mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBootloader_version() {
        return this.bootloader_version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuild_id() {
        return this.build_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getCapabilities() {
        return this.capabilities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoin_switch() {
        return this.coin_switch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCpu_info() {
        return this.cpu_info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevice_id() {
        return this.device_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDisplay_rotation() {
        return this.display_rotation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getExperimental_features() {
        return this.experimental_features;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFirmware_present() {
        return this.firmware_present;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFlags() {
        return this.flags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFw_major() {
        return this.fw_major;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFw_minor() {
        return this.fw_minor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFw_patch() {
        return this.fw_patch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFw_vendor() {
        return this.fw_vendor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFw_vendor_keys() {
        return this.fw_vendor_keys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getImported() {
        return this.imported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getInitialized() {
        return this.initialized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getInitstates() {
        return this.initstates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMajor_version() {
        return this.major_version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMinor_version() {
        return this.minor_version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModel() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNFT_voucher() {
        return this.NFT_voucher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeeds_backup() {
        return this.needs_backup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNo_backup() {
        return this.no_backup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getOffset() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOnekey_serial() {
        return this.onekey_serial;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOnekey_version() {
        return this.onekey_version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPassphrase_always_on_device() {
        return this.passphrase_always_on_device;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPassphrase_protection() {
        return this.passphrase_protection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPatch_version() {
        return this.patch_version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPin_protection() {
        return this.pin_protection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPre_firmware() {
        return this.pre_firmware;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRecovery_mode() {
        return this.recovery_mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRevision() {
        return this.revision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafety_checks() {
        return this.safety_checks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSd_card_present() {
        return this.sd_card_present;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSd_protection() {
        return this.sd_protection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSe_enable() {
        return this.se_enable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSe_ver() {
        return this.se_ver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSerial_no() {
        return this.serial_no;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpi_flash() {
        return this.spi_flash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUnfinished_backup() {
        return this.unfinished_backup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUnlocked() {
        return this.unlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVendor() {
        return this.vendor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getWipe_code_protection() {
        return this.wipe_code_protection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean get_passphrase_cached() {
        return this._passphrase_cached;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.vendor);
        parcel.writeLong(this.major_version);
        parcel.writeLong(this.minor_version);
        parcel.writeLong(this.patch_version);
        Boolean bool = this.bootloader_mode;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.device_id);
        Boolean bool2 = this.pin_protection;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.passphrase_protection;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.language);
        parcel.writeString(this.label);
        Boolean bool4 = this.initialized;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.revision);
        parcel.writeString(this.bootloader_hash);
        Boolean bool5 = this.imported;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.unlocked;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this._passphrase_cached;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.firmware_present;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.needs_backup;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        Long l = this.flags;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.model);
        Long l2 = this.fw_major;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.fw_minor;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.fw_patch;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        parcel.writeString(this.fw_vendor);
        parcel.writeString(this.fw_vendor_keys);
        Boolean bool10 = this.unfinished_backup;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool10.booleanValue() ? 1 : 0);
        }
        Boolean bool11 = this.no_backup;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool11.booleanValue() ? 1 : 0);
        }
        Boolean bool12 = this.recovery_mode;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool12.booleanValue() ? 1 : 0);
        }
        List<Integer> list = this.capabilities;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeString(this.backup_type);
        Boolean bool13 = this.sd_card_present;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool13.booleanValue() ? 1 : 0);
        }
        Boolean bool14 = this.sd_protection;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool14.booleanValue() ? 1 : 0);
        }
        Boolean bool15 = this.wipe_code_protection;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool15.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.session_id);
        Boolean bool16 = this.passphrase_always_on_device;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool16.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.safety_checks);
        Long l5 = this.auto_lock_delay_ms;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        Long l6 = this.display_rotation;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l6.longValue());
        }
        Boolean bool17 = this.experimental_features;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool17.booleanValue() ? 1 : 0);
        }
        Long l7 = this.offset;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l7.longValue());
        }
        parcel.writeString(this.ble_name);
        parcel.writeString(this.ble_ver);
        Boolean bool18 = this.ble_enable;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool18.booleanValue() ? 1 : 0);
        }
        Boolean bool19 = this.se_enable;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool19.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.se_ver);
        Boolean bool20 = this.backup_only;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool20.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.onekey_version);
        parcel.writeString(this.onekey_serial);
        parcel.writeString(this.bootloader_version);
        parcel.writeString(this.serial_no);
        parcel.writeString(this.spi_flash);
        Long l8 = this.initstates;
        if (l8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l8.longValue());
        }
        parcel.writeString(this.NFT_voucher);
        parcel.writeString(this.cpu_info);
        parcel.writeString(this.pre_firmware);
        Long l9 = this.coin_switch;
        if (l9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l9.longValue());
        }
        parcel.writeString(this.build_id);
        Long l10 = this.battery_level;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.Features.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Features> serializer() {
            return Features$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Features(int i, int i2, String str, long j, long j2, long j3, Boolean bool, String str2, Boolean bool2, Boolean bool3, String str3, String str4, Boolean bool4, String str5, String str6, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Long l, String str7, Long l2, Long l3, Long l4, String str8, String str9, Boolean bool10, Boolean bool11, Boolean bool12, List list, String str10, Boolean bool13, Boolean bool14, Boolean bool15, String str11, Boolean bool16, String str12, Long l5, Long l6, Boolean bool17, Long l7, String str13, String str14, Boolean bool18, Boolean bool19, String str15, Boolean bool20, String str16, String str17, String str18, String str19, String str20, Long l8, String str21, String str22, String str23, Long l9, String str24, Long l10, SerializationConstructorMarker serializationConstructorMarker) {
        if (268959759 != (i & 268959759)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{268959759, 0}, Features$$serializer.INSTANCE.getDescriptor());
        }
        this.vendor = str;
        this.major_version = j;
        this.minor_version = j2;
        this.patch_version = j3;
        if ((i & 16) == 0) {
            this.bootloader_mode = null;
        } else {
            this.bootloader_mode = bool;
        }
        if ((i & 32) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str2;
        }
        if ((i & 64) == 0) {
            this.pin_protection = null;
        } else {
            this.pin_protection = bool2;
        }
        if ((i & 128) == 0) {
            this.passphrase_protection = null;
        } else {
            this.passphrase_protection = bool3;
        }
        if ((i & 256) == 0) {
            this.language = null;
        } else {
            this.language = str3;
        }
        if ((i & 512) == 0) {
            this.label = null;
        } else {
            this.label = str4;
        }
        if ((i & 1024) == 0) {
            this.initialized = null;
        } else {
            this.initialized = bool4;
        }
        if ((i & 2048) == 0) {
            this.revision = null;
        } else {
            this.revision = str5;
        }
        if ((i & 4096) == 0) {
            this.bootloader_hash = null;
        } else {
            this.bootloader_hash = str6;
        }
        if ((i & 8192) == 0) {
            this.imported = null;
        } else {
            this.imported = bool5;
        }
        if ((i & 16384) == 0) {
            this.unlocked = null;
        } else {
            this.unlocked = bool6;
        }
        if ((i & 32768) == 0) {
            this._passphrase_cached = null;
        } else {
            this._passphrase_cached = bool7;
        }
        if ((i & 65536) == 0) {
            this.firmware_present = null;
        } else {
            this.firmware_present = bool8;
        }
        if ((i & 131072) == 0) {
            this.needs_backup = null;
        } else {
            this.needs_backup = bool9;
        }
        if ((i & 262144) == 0) {
            this.flags = null;
        } else {
            this.flags = l;
        }
        this.model = str7;
        if ((i & 1048576) == 0) {
            this.fw_major = null;
        } else {
            this.fw_major = l2;
        }
        if ((i & 2097152) == 0) {
            this.fw_minor = null;
        } else {
            this.fw_minor = l3;
        }
        if ((i & 4194304) == 0) {
            this.fw_patch = null;
        } else {
            this.fw_patch = l4;
        }
        if ((8388608 & i) == 0) {
            this.fw_vendor = null;
        } else {
            this.fw_vendor = str8;
        }
        if ((16777216 & i) == 0) {
            this.fw_vendor_keys = null;
        } else {
            this.fw_vendor_keys = str9;
        }
        if ((33554432 & i) == 0) {
            this.unfinished_backup = null;
        } else {
            this.unfinished_backup = bool10;
        }
        if ((67108864 & i) == 0) {
            this.no_backup = null;
        } else {
            this.no_backup = bool11;
        }
        if ((134217728 & i) == 0) {
            this.recovery_mode = null;
        } else {
            this.recovery_mode = bool12;
        }
        this.capabilities = list;
        if ((536870912 & i) == 0) {
            this.backup_type = null;
        } else {
            this.backup_type = str10;
        }
        if ((1073741824 & i) == 0) {
            this.sd_card_present = null;
        } else {
            this.sd_card_present = bool13;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.sd_protection = null;
        } else {
            this.sd_protection = bool14;
        }
        if ((i2 & 1) == 0) {
            this.wipe_code_protection = null;
        } else {
            this.wipe_code_protection = bool15;
        }
        if ((i2 & 2) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str11;
        }
        if ((i2 & 4) == 0) {
            this.passphrase_always_on_device = null;
        } else {
            this.passphrase_always_on_device = bool16;
        }
        if ((i2 & 8) == 0) {
            this.safety_checks = null;
        } else {
            this.safety_checks = str12;
        }
        if ((i2 & 16) == 0) {
            this.auto_lock_delay_ms = null;
        } else {
            this.auto_lock_delay_ms = l5;
        }
        if ((i2 & 32) == 0) {
            this.display_rotation = null;
        } else {
            this.display_rotation = l6;
        }
        if ((i2 & 64) == 0) {
            this.experimental_features = null;
        } else {
            this.experimental_features = bool17;
        }
        if ((i2 & 128) == 0) {
            this.offset = null;
        } else {
            this.offset = l7;
        }
        if ((i2 & 256) == 0) {
            this.ble_name = null;
        } else {
            this.ble_name = str13;
        }
        if ((i2 & 512) == 0) {
            this.ble_ver = null;
        } else {
            this.ble_ver = str14;
        }
        if ((i2 & 1024) == 0) {
            this.ble_enable = null;
        } else {
            this.ble_enable = bool18;
        }
        if ((i2 & 2048) == 0) {
            this.se_enable = null;
        } else {
            this.se_enable = bool19;
        }
        if ((i2 & 4096) == 0) {
            this.se_ver = null;
        } else {
            this.se_ver = str15;
        }
        if ((i2 & 8192) == 0) {
            this.backup_only = null;
        } else {
            this.backup_only = bool20;
        }
        if ((i2 & 16384) == 0) {
            this.onekey_version = null;
        } else {
            this.onekey_version = str16;
        }
        if ((i2 & 32768) == 0) {
            this.onekey_serial = null;
        } else {
            this.onekey_serial = str17;
        }
        if ((i2 & 65536) == 0) {
            this.bootloader_version = null;
        } else {
            this.bootloader_version = str18;
        }
        if ((i2 & 131072) == 0) {
            this.serial_no = null;
        } else {
            this.serial_no = str19;
        }
        if ((i2 & 262144) == 0) {
            this.spi_flash = null;
        } else {
            this.spi_flash = str20;
        }
        if ((524288 & i2) == 0) {
            this.initstates = null;
        } else {
            this.initstates = l8;
        }
        if ((i2 & 1048576) == 0) {
            this.NFT_voucher = null;
        } else {
            this.NFT_voucher = str21;
        }
        if ((i2 & 2097152) == 0) {
            this.cpu_info = null;
        } else {
            this.cpu_info = str22;
        }
        if ((i2 & 4194304) == 0) {
            this.pre_firmware = null;
        } else {
            this.pre_firmware = str23;
        }
        if ((8388608 & i2) == 0) {
            this.coin_switch = null;
        } else {
            this.coin_switch = l9;
        }
        if ((16777216 & i2) == 0) {
            this.build_id = null;
        } else {
            this.build_id = str24;
        }
        if ((33554432 & i2) == 0) {
            this.battery_level = null;
        } else {
            this.battery_level = l10;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(Features features, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, features.vendor);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, features.major_version);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, features.minor_version);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, features.patch_version);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || features.bootloader_mode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, features.bootloader_mode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || features.device_id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, features.device_id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || features.pin_protection != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, features.pin_protection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || features.passphrase_protection != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, features.passphrase_protection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || features.language != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, features.language);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || features.label != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, features.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || features.initialized != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, features.initialized);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || features.revision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, features.revision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || features.bootloader_hash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, features.bootloader_hash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || features.imported != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, features.imported);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || features.unlocked != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, features.unlocked);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || features._passphrase_cached != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, features._passphrase_cached);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || features.firmware_present != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, features.firmware_present);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || features.needs_backup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, features.needs_backup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || features.flags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, LongSerializer.INSTANCE, features.flags);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 19, features.model);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || features.fw_major != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, LongSerializer.INSTANCE, features.fw_major);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || features.fw_minor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, LongSerializer.INSTANCE, features.fw_minor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || features.fw_patch != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, LongSerializer.INSTANCE, features.fw_patch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || features.fw_vendor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, features.fw_vendor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || features.fw_vendor_keys != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, features.fw_vendor_keys);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || features.unfinished_backup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, BooleanSerializer.INSTANCE, features.unfinished_backup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || features.no_backup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, BooleanSerializer.INSTANCE, features.no_backup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || features.recovery_mode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, BooleanSerializer.INSTANCE, features.recovery_mode);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 28, kSerializerArr[28], features.capabilities);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || features.backup_type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, features.backup_type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || features.sd_card_present != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, BooleanSerializer.INSTANCE, features.sd_card_present);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || features.sd_protection != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, BooleanSerializer.INSTANCE, features.sd_protection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || features.wipe_code_protection != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, BooleanSerializer.INSTANCE, features.wipe_code_protection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || features.session_id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, features.session_id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || features.passphrase_always_on_device != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, BooleanSerializer.INSTANCE, features.passphrase_always_on_device);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || features.safety_checks != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, features.safety_checks);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || features.auto_lock_delay_ms != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, LongSerializer.INSTANCE, features.auto_lock_delay_ms);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || features.display_rotation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, LongSerializer.INSTANCE, features.display_rotation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || features.experimental_features != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, BooleanSerializer.INSTANCE, features.experimental_features);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || features.offset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, LongSerializer.INSTANCE, features.offset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || features.ble_name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, StringSerializer.INSTANCE, features.ble_name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || features.ble_ver != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, StringSerializer.INSTANCE, features.ble_ver);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || features.ble_enable != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, BooleanSerializer.INSTANCE, features.ble_enable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || features.se_enable != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, BooleanSerializer.INSTANCE, features.se_enable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || features.se_ver != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, StringSerializer.INSTANCE, features.se_ver);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || features.backup_only != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, BooleanSerializer.INSTANCE, features.backup_only);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || features.onekey_version != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, StringSerializer.INSTANCE, features.onekey_version);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || features.onekey_serial != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, StringSerializer.INSTANCE, features.onekey_serial);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || features.bootloader_version != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, StringSerializer.INSTANCE, features.bootloader_version);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || features.serial_no != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, StringSerializer.INSTANCE, features.serial_no);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || features.spi_flash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, StringSerializer.INSTANCE, features.spi_flash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || features.initstates != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, LongSerializer.INSTANCE, features.initstates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || features.NFT_voucher != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, StringSerializer.INSTANCE, features.NFT_voucher);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || features.cpu_info != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, StringSerializer.INSTANCE, features.cpu_info);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || features.pre_firmware != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, StringSerializer.INSTANCE, features.pre_firmware);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || features.coin_switch != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, LongSerializer.INSTANCE, features.coin_switch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || features.build_id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, StringSerializer.INSTANCE, features.build_id);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) && features.battery_level == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, LongSerializer.INSTANCE, features.battery_level);
    }

    public Features(@NotNull String str, long j, long j2, long j3, Boolean bool, String str2, Boolean bool2, Boolean bool3, String str3, String str4, Boolean bool4, String str5, String str6, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Long l, @NotNull String str7, Long l2, Long l3, Long l4, String str8, String str9, Boolean bool10, Boolean bool11, Boolean bool12, @NotNull List<Integer> list, String str10, Boolean bool13, Boolean bool14, Boolean bool15, String str11, Boolean bool16, String str12, Long l5, Long l6, Boolean bool17, Long l7, String str13, String str14, Boolean bool18, Boolean bool19, String str15, Boolean bool20, String str16, String str17, String str18, String str19, String str20, Long l8, String str21, String str22, String str23, Long l9, String str24, Long l10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.vendor = str;
        this.major_version = j;
        this.minor_version = j2;
        this.patch_version = j3;
        this.bootloader_mode = bool;
        this.device_id = str2;
        this.pin_protection = bool2;
        this.passphrase_protection = bool3;
        this.language = str3;
        this.label = str4;
        this.initialized = bool4;
        this.revision = str5;
        this.bootloader_hash = str6;
        this.imported = bool5;
        this.unlocked = bool6;
        this._passphrase_cached = bool7;
        this.firmware_present = bool8;
        this.needs_backup = bool9;
        this.flags = l;
        this.model = str7;
        this.fw_major = l2;
        this.fw_minor = l3;
        this.fw_patch = l4;
        this.fw_vendor = str8;
        this.fw_vendor_keys = str9;
        this.unfinished_backup = bool10;
        this.no_backup = bool11;
        this.recovery_mode = bool12;
        this.capabilities = list;
        this.backup_type = str10;
        this.sd_card_present = bool13;
        this.sd_protection = bool14;
        this.wipe_code_protection = bool15;
        this.session_id = str11;
        this.passphrase_always_on_device = bool16;
        this.safety_checks = str12;
        this.auto_lock_delay_ms = l5;
        this.display_rotation = l6;
        this.experimental_features = bool17;
        this.offset = l7;
        this.ble_name = str13;
        this.ble_ver = str14;
        this.ble_enable = bool18;
        this.se_enable = bool19;
        this.se_ver = str15;
        this.backup_only = bool20;
        this.onekey_version = str16;
        this.onekey_serial = str17;
        this.bootloader_version = str18;
        this.serial_no = str19;
        this.spi_flash = str20;
        this.initstates = l8;
        this.NFT_voucher = str21;
        this.cpu_info = str22;
        this.pre_firmware = str23;
        this.coin_switch = l9;
        this.build_id = str24;
        this.battery_level = l10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0203: CONSTRUCTOR 
  (r67v0 java.lang.String)
  (r68v0 long)
  (r70v0 long)
  (r72v0 long)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0004: ARITH (r128v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r74v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r128v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r75v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r128v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r76v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r128v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r77v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r128v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r128v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r79v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r128v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r80v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r128v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r128v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r82v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r128v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r83v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r128v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r84v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0067: ARITH (r128v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r85v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0072: ARITH (r128v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r86v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r128v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r87v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0088: ARITH (r128v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r88v0 java.lang.Long))
  (r89v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0093: ARITH (r128v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r90v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x009e: ARITH (r128v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r91v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r128v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r92v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r128v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r93v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r128v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r94v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r128v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r95v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r128v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r96v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r128v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r97v0 java.lang.Boolean))
  (r98v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r128v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r99v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r128v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r100v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0101: ARITH (r128v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r101v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x010a: ARITH (r129v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r102v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0113: ARITH (r129v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r103v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x011c: ARITH (r129v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r104v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0125: ARITH (r129v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r105v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x012e: ARITH (r129v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r106v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0137: ARITH (r129v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r107v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0140: ARITH (r129v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r108v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0149: ARITH (r129v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r109v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0152: ARITH (r129v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r110v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015b: ARITH (r129v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r111v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0164: ARITH (r129v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r112v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x016d: ARITH (r129v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r113v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0176: ARITH (r129v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r114v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x017f: ARITH (r129v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r115v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0188: ARITH (r129v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r116v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0191: ARITH (r129v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r117v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x019a: ARITH (r129v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r118v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01a3: ARITH (r129v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r119v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ac: ARITH (r129v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r120v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x01b7: ARITH (524288 int) & (r129v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r121v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01bf: ARITH (r129v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r122v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01c8: ARITH (r129v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r123v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d1: ARITH (r129v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r124v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x01da: ARITH (r129v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r125v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e3: ARITH (r129v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r126v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x01ec: ARITH (r129v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r127v0 java.lang.Long))
 A[MD:(java.lang.String, long, long, long, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List<java.lang.Integer>, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long):void (m)] (LINE:87) call: com.okinc.wallet.hardware.api.onekey.Features.<init>(java.lang.String, long, long, long, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ Features(String str, long j, long j2, long j3, Boolean bool, String str2, Boolean bool2, Boolean bool3, String str3, String str4, Boolean bool4, String str5, String str6, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Long l, String str7, Long l2, Long l3, Long l4, String str8, String str9, Boolean bool10, Boolean bool11, Boolean bool12, List list, String str10, Boolean bool13, Boolean bool14, Boolean bool15, String str11, Boolean bool16, String str12, Long l5, Long l6, Boolean bool17, Long l7, String str13, String str14, Boolean bool18, Boolean bool19, String str15, Boolean bool20, String str16, String str17, String str18, String str19, String str20, Long l8, String str21, String str22, String str23, Long l9, String str24, Long l10, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, j3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : bool3, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : bool4, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : bool5, (i & 16384) != 0 ? null : bool6, (i & 32768) != 0 ? null : bool7, (i & 65536) != 0 ? null : bool8, (i & 131072) != 0 ? null : bool9, (i & 262144) != 0 ? null : l, str7, (i & 1048576) != 0 ? null : l2, (i & 2097152) != 0 ? null : l3, (i & 4194304) != 0 ? null : l4, (i & 8388608) != 0 ? null : str8, (i & 16777216) != 0 ? null : str9, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : bool10, (i & 67108864) != 0 ? null : bool11, (i & 134217728) != 0 ? null : bool12, list, (i & 536870912) != 0 ? null : str10, (i & 1073741824) != 0 ? null : bool13, (i & Integer.MIN_VALUE) != 0 ? null : bool14, (i2 & 1) != 0 ? null : bool15, (i2 & 2) != 0 ? null : str11, (i2 & 4) != 0 ? null : bool16, (i2 & 8) != 0 ? null : str12, (i2 & 16) != 0 ? null : l5, (i2 & 32) != 0 ? null : l6, (i2 & 64) != 0 ? null : bool17, (i2 & 128) != 0 ? null : l7, (i2 & 256) != 0 ? null : str13, (i2 & 512) != 0 ? null : str14, (i2 & 1024) != 0 ? null : bool18, (i2 & 2048) != 0 ? null : bool19, (i2 & 4096) != 0 ? null : str15, (i2 & 8192) != 0 ? null : bool20, (i2 & 16384) != 0 ? null : str16, (i2 & 32768) != 0 ? null : str17, (i2 & 65536) != 0 ? null : str18, (i2 & 131072) != 0 ? null : str19, (i2 & 262144) != 0 ? null : str20, (524288 & i2) != 0 ? null : l8, (i2 & 1048576) != 0 ? null : str21, (i2 & 2097152) != 0 ? null : str22, (i2 & 4194304) != 0 ? null : str23, (i2 & 8388608) != 0 ? null : l9, (i2 & 16777216) != 0 ? null : str24, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(Features.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        Features features = (Features) obj;
        return Intrinsics.EZpvd((Object) this.vendor, (Object) features.vendor) && this.major_version == features.major_version && this.minor_version == features.minor_version && this.patch_version == features.patch_version && Intrinsics.EZpvd(this.bootloader_mode, features.bootloader_mode) && Intrinsics.EZpvd((Object) this.device_id, (Object) features.device_id) && Intrinsics.EZpvd(this.pin_protection, features.pin_protection) && Intrinsics.EZpvd(this.passphrase_protection, features.passphrase_protection) && Intrinsics.EZpvd((Object) this.language, (Object) features.language) && Intrinsics.EZpvd((Object) this.label, (Object) features.label) && Intrinsics.EZpvd(this.initialized, features.initialized) && Intrinsics.EZpvd((Object) this.revision, (Object) features.revision) && Intrinsics.EZpvd((Object) this.bootloader_hash, (Object) features.bootloader_hash) && Intrinsics.EZpvd(this.imported, features.imported) && Intrinsics.EZpvd(this.unlocked, features.unlocked) && Intrinsics.EZpvd(this._passphrase_cached, features._passphrase_cached) && Intrinsics.EZpvd(this.firmware_present, features.firmware_present) && Intrinsics.EZpvd(this.needs_backup, features.needs_backup) && Intrinsics.EZpvd(this.flags, features.flags) && Intrinsics.EZpvd((Object) this.model, (Object) features.model) && Intrinsics.EZpvd(this.fw_major, features.fw_major) && Intrinsics.EZpvd(this.fw_minor, features.fw_minor) && Intrinsics.EZpvd(this.fw_patch, features.fw_patch) && Intrinsics.EZpvd((Object) this.fw_vendor, (Object) features.fw_vendor) && Intrinsics.EZpvd((Object) this.fw_vendor_keys, (Object) features.fw_vendor_keys) && Intrinsics.EZpvd(this.unfinished_backup, features.unfinished_backup) && Intrinsics.EZpvd(this.no_backup, features.no_backup) && Intrinsics.EZpvd(this.recovery_mode, features.recovery_mode) && Intrinsics.EZpvd(this.capabilities, features.capabilities) && Intrinsics.EZpvd((Object) this.backup_type, (Object) features.backup_type) && Intrinsics.EZpvd(this.sd_card_present, features.sd_card_present) && Intrinsics.EZpvd(this.sd_protection, features.sd_protection) && Intrinsics.EZpvd(this.wipe_code_protection, features.wipe_code_protection) && Intrinsics.EZpvd((Object) this.session_id, (Object) features.session_id) && Intrinsics.EZpvd(this.passphrase_always_on_device, features.passphrase_always_on_device) && Intrinsics.EZpvd((Object) this.safety_checks, (Object) features.safety_checks) && Intrinsics.EZpvd(this.auto_lock_delay_ms, features.auto_lock_delay_ms) && Intrinsics.EZpvd(this.display_rotation, features.display_rotation) && Intrinsics.EZpvd(this.experimental_features, features.experimental_features) && Intrinsics.EZpvd(this.offset, features.offset) && Intrinsics.EZpvd((Object) this.ble_name, (Object) features.ble_name) && Intrinsics.EZpvd((Object) this.ble_ver, (Object) features.ble_ver) && Intrinsics.EZpvd(this.ble_enable, features.ble_enable) && Intrinsics.EZpvd(this.se_enable, features.se_enable) && Intrinsics.EZpvd((Object) this.se_ver, (Object) features.se_ver) && Intrinsics.EZpvd(this.backup_only, features.backup_only) && Intrinsics.EZpvd((Object) this.onekey_version, (Object) features.onekey_version) && Intrinsics.EZpvd((Object) this.onekey_serial, (Object) features.onekey_serial) && Intrinsics.EZpvd((Object) this.bootloader_version, (Object) features.bootloader_version) && Intrinsics.EZpvd((Object) this.serial_no, (Object) features.serial_no) && Intrinsics.EZpvd((Object) this.spi_flash, (Object) features.spi_flash) && Intrinsics.EZpvd(this.initstates, features.initstates) && Intrinsics.EZpvd((Object) this.NFT_voucher, (Object) features.NFT_voucher) && Intrinsics.EZpvd((Object) this.cpu_info, (Object) features.cpu_info) && Intrinsics.EZpvd((Object) this.pre_firmware, (Object) features.pre_firmware) && Intrinsics.EZpvd(this.coin_switch, features.coin_switch) && Intrinsics.EZpvd((Object) this.build_id, (Object) features.build_id) && Intrinsics.EZpvd(this.battery_level, features.battery_level);
    }

    public int hashCode() {
        int iHashCode = this.vendor.hashCode();
        int iHashCode2 = Long.hashCode(this.major_version);
        int iHashCode3 = Long.hashCode(this.minor_version);
        int iHashCode4 = Long.hashCode(this.patch_version);
        Boolean bool = this.bootloader_mode;
        int iHashCode5 = bool != null ? bool.hashCode() : 0;
        String str = this.device_id;
        int iHashCode6 = str != null ? str.hashCode() : 0;
        Boolean bool2 = this.pin_protection;
        int iHashCode7 = bool2 != null ? bool2.hashCode() : 0;
        Boolean bool3 = this.passphrase_protection;
        int iHashCode8 = bool3 != null ? bool3.hashCode() : 0;
        String str2 = this.language;
        int iHashCode9 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.label;
        int iHashCode10 = str3 != null ? str3.hashCode() : 0;
        Boolean bool4 = this.initialized;
        int iHashCode11 = bool4 != null ? bool4.hashCode() : 0;
        String str4 = this.revision;
        int iHashCode12 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.bootloader_hash;
        int iHashCode13 = str5 != null ? str5.hashCode() : 0;
        Boolean bool5 = this.imported;
        int iHashCode14 = bool5 != null ? bool5.hashCode() : 0;
        Boolean bool6 = this.unlocked;
        int iHashCode15 = bool6 != null ? bool6.hashCode() : 0;
        Boolean bool7 = this._passphrase_cached;
        int iHashCode16 = bool7 != null ? bool7.hashCode() : 0;
        Boolean bool8 = this.firmware_present;
        int iHashCode17 = bool8 != null ? bool8.hashCode() : 0;
        Boolean bool9 = this.needs_backup;
        int iHashCode18 = bool9 != null ? bool9.hashCode() : 0;
        Long l = this.flags;
        int iHashCode19 = l != null ? l.hashCode() : 0;
        int iHashCode20 = this.model.hashCode();
        Long l2 = this.fw_major;
        int iHashCode21 = l2 != null ? l2.hashCode() : 0;
        Long l3 = this.fw_minor;
        int iHashCode22 = l3 != null ? l3.hashCode() : 0;
        Long l4 = this.fw_patch;
        int iHashCode23 = l4 != null ? l4.hashCode() : 0;
        String str6 = this.fw_vendor;
        int iHashCode24 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.fw_vendor_keys;
        int iHashCode25 = str7 != null ? str7.hashCode() : 0;
        Boolean bool10 = this.unfinished_backup;
        int iHashCode26 = bool10 != null ? bool10.hashCode() : 0;
        Boolean bool11 = this.no_backup;
        int iHashCode27 = bool11 != null ? bool11.hashCode() : 0;
        Boolean bool12 = this.recovery_mode;
        int iHashCode28 = bool12 != null ? bool12.hashCode() : 0;
        int iHashCode29 = this.capabilities.hashCode();
        String str8 = this.backup_type;
        int iHashCode30 = str8 != null ? str8.hashCode() : 0;
        Boolean bool13 = this.sd_card_present;
        int iHashCode31 = bool13 != null ? bool13.hashCode() : 0;
        Boolean bool14 = this.sd_protection;
        int iHashCode32 = bool14 != null ? bool14.hashCode() : 0;
        Boolean bool15 = this.wipe_code_protection;
        int iHashCode33 = bool15 != null ? bool15.hashCode() : 0;
        String str9 = this.session_id;
        int iHashCode34 = str9 != null ? str9.hashCode() : 0;
        Boolean bool16 = this.passphrase_always_on_device;
        int iHashCode35 = bool16 != null ? bool16.hashCode() : 0;
        String str10 = this.safety_checks;
        int iHashCode36 = str10 != null ? str10.hashCode() : 0;
        Long l5 = this.auto_lock_delay_ms;
        int iHashCode37 = l5 != null ? l5.hashCode() : 0;
        Long l6 = this.display_rotation;
        int iHashCode38 = l6 != null ? l6.hashCode() : 0;
        Boolean bool17 = this.experimental_features;
        int iHashCode39 = bool17 != null ? bool17.hashCode() : 0;
        Long l7 = this.offset;
        int iHashCode40 = l7 != null ? l7.hashCode() : 0;
        String str11 = this.ble_name;
        int iHashCode41 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.ble_ver;
        int iHashCode42 = str12 != null ? str12.hashCode() : 0;
        Boolean bool18 = this.ble_enable;
        int iHashCode43 = bool18 != null ? bool18.hashCode() : 0;
        Boolean bool19 = this.se_enable;
        int iHashCode44 = bool19 != null ? bool19.hashCode() : 0;
        String str13 = this.se_ver;
        int iHashCode45 = str13 != null ? str13.hashCode() : 0;
        Boolean bool20 = this.backup_only;
        int iHashCode46 = bool20 != null ? bool20.hashCode() : 0;
        String str14 = this.onekey_version;
        int iHashCode47 = str14 != null ? str14.hashCode() : 0;
        String str15 = this.onekey_serial;
        int iHashCode48 = str15 != null ? str15.hashCode() : 0;
        String str16 = this.bootloader_version;
        int iHashCode49 = str16 != null ? str16.hashCode() : 0;
        String str17 = this.serial_no;
        int iHashCode50 = str17 != null ? str17.hashCode() : 0;
        String str18 = this.spi_flash;
        int iHashCode51 = str18 != null ? str18.hashCode() : 0;
        Long l8 = this.initstates;
        int iHashCode52 = l8 != null ? l8.hashCode() : 0;
        String str19 = this.NFT_voucher;
        int iHashCode53 = str19 != null ? str19.hashCode() : 0;
        String str20 = this.cpu_info;
        int iHashCode54 = str20 != null ? str20.hashCode() : 0;
        String str21 = this.pre_firmware;
        int iHashCode55 = str21 != null ? str21.hashCode() : 0;
        Long l9 = this.coin_switch;
        int iHashCode56 = l9 != null ? l9.hashCode() : 0;
        String str22 = this.build_id;
        int iHashCode57 = str22 != null ? str22.hashCode() : 0;
        Long l10 = this.battery_level;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "Features(vendor='" + this.vendor + "', major_version=" + this.major_version + ", minor_version=" + this.minor_version + ", patch_version=" + this.patch_version + ", bootloader_mode=" + this.bootloader_mode + ", device_id=" + this.device_id + ", pin_protection=" + this.pin_protection + ", passphrase_protection=" + this.passphrase_protection + ", language=" + this.language + ", label=" + this.label + ", initialized=" + this.initialized + ", revision=" + this.revision + ", bootloader_hash=" + this.bootloader_hash + ", imported=" + this.imported + ", unlocked=" + this.unlocked + ", _passphrase_cached=" + this._passphrase_cached + ", firmware_present=" + this.firmware_present + ", needs_backup=" + this.needs_backup + ", flags=" + this.flags + ", model='" + this.model + "', fw_major=" + this.fw_major + ", fw_minor=" + this.fw_minor + ", fw_patch=" + this.fw_patch + ", fw_vendor=" + this.fw_vendor + ", fw_vendor_keys=" + this.fw_vendor_keys + ", unfinished_backup=" + this.unfinished_backup + ", no_backup=" + this.no_backup + ", recovery_mode=" + this.recovery_mode + ", capabilities=" + this.capabilities + ", backup_type=" + this.backup_type + ", sd_card_present=" + this.sd_card_present + ", sd_protection=" + this.sd_protection + ", wipe_code_protection=" + this.wipe_code_protection + ", session_id=" + this.session_id + ", passphrase_always_on_device=" + this.passphrase_always_on_device + ", safety_checks=" + this.safety_checks + ", auto_lock_delay_ms=" + this.auto_lock_delay_ms + ", display_rotation=" + this.display_rotation + ", experimental_features=" + this.experimental_features + ", offset=" + this.offset + ", ble_name=" + this.ble_name + ", ble_ver=" + this.ble_ver + ", ble_enable=" + this.ble_enable + ", se_enable=" + this.se_enable + ", se_ver=" + this.se_ver + ", backup_only=" + this.backup_only + ", onekey_version=" + this.onekey_version + ", onekey_serial=" + this.onekey_serial + ", bootloader_version=" + this.bootloader_version + ", serial_no=" + this.serial_no + ", spi_flash=" + this.spi_flash + ", initstates=" + this.initstates + ", NFT_voucher=" + this.NFT_voucher + ", cpu_info=" + this.cpu_info + ", pre_firmware=" + this.pre_firmware + ", coin_switch=" + this.coin_switch + ", build_id=" + this.build_id + ", battery_level=" + this.battery_level + ")";
    }
}
