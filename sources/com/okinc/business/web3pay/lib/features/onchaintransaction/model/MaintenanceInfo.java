package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class MaintenanceInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long maintenanceBeginTime;
    private final long maintenanceEndTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MaintenanceInfo copy$default(MaintenanceInfo maintenanceInfo, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = maintenanceInfo.maintenanceBeginTime;
        }
        if ((i & 2) != 0) {
            j2 = maintenanceInfo.maintenanceEndTime;
        }
        return maintenanceInfo.copy(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.maintenanceBeginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.maintenanceEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MaintenanceInfo copy(long j, long j2) {
        return new MaintenanceInfo(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaintenanceInfo)) {
            return false;
        }
        MaintenanceInfo maintenanceInfo = (MaintenanceInfo) obj;
        return this.maintenanceBeginTime == maintenanceInfo.maintenanceBeginTime && this.maintenanceEndTime == maintenanceInfo.maintenanceEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMaintenanceBeginTime() {
        return this.maintenanceBeginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMaintenanceEndTime() {
        return this.maintenanceEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.maintenanceBeginTime) * 31) + Long.hashCode(this.maintenanceEndTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MaintenanceInfo(maintenanceBeginTime=" + this.maintenanceBeginTime + ", maintenanceEndTime=" + this.maintenanceEndTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.MaintenanceInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MaintenanceInfo> serializer() {
            return MaintenanceInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MaintenanceInfo(int i, long j, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, MaintenanceInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.maintenanceBeginTime = j;
        this.maintenanceEndTime = j2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(MaintenanceInfo maintenanceInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, maintenanceInfo.maintenanceBeginTime);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, maintenanceInfo.maintenanceEndTime);
    }

    public MaintenanceInfo(long j, long j2) {
        this.maintenanceBeginTime = j;
        this.maintenanceEndTime = j2;
    }
}
