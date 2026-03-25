package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class SyncItemEntity {
    public static final int $stable = 8;
    private String data;
    private int id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SyncItemEntity() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SyncItemEntity copy$default(SyncItemEntity syncItemEntity, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = syncItemEntity.id;
        }
        if ((i2 & 2) != 0) {
            str = syncItemEntity.data;
        }
        return syncItemEntity.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncItemEntity copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SyncItemEntity(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncItemEntity)) {
            return false;
        }
        SyncItemEntity syncItemEntity = (SyncItemEntity) obj;
        return this.id == syncItemEntity.id && Intrinsics.EZpvd((Object) this.data, (Object) syncItemEntity.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(int i) {
        this.id = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncItemEntity(id=" + this.id + ", data=" + this.data + ")";
    }

    public SyncItemEntity(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = i;
        this.data = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(int, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.defi.biz.database.wallet.entity.SyncItemEntity.<init>(int, java.lang.String):void type: THIS */
    public /* synthetic */ SyncItemEntity(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
