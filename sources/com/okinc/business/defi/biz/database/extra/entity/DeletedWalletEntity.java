package com.okinc.business.defi.biz.database.extra.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DeletedWalletEntity {
    public static final int $stable = 8;
    private String id;
    private int status;
    private String xpriv;
    private String xpub;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeletedWalletEntity() {
        this(null, null, null, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeletedWalletEntity copy$default(DeletedWalletEntity deletedWalletEntity, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deletedWalletEntity.id;
        }
        if ((i2 & 2) != 0) {
            str2 = deletedWalletEntity.xpriv;
        }
        if ((i2 & 4) != 0) {
            str3 = deletedWalletEntity.xpub;
        }
        if ((i2 & 8) != 0) {
            i = deletedWalletEntity.status;
        }
        return deletedWalletEntity.copy(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.xpriv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.xpub;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeletedWalletEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DeletedWalletEntity(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletedWalletEntity)) {
            return false;
        }
        DeletedWalletEntity deletedWalletEntity = (DeletedWalletEntity) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) deletedWalletEntity.id) && Intrinsics.EZpvd((Object) this.xpriv, (Object) deletedWalletEntity.xpriv) && Intrinsics.EZpvd((Object) this.xpub, (Object) deletedWalletEntity.xpub) && this.status == deletedWalletEntity.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXpriv() {
        return this.xpriv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXpub() {
        return this.xpub;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.xpriv.hashCode()) * 31) + this.xpub.hashCode()) * 31) + Integer.hashCode(this.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setXpriv(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.xpriv = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setXpub(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.xpub = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeletedWalletEntity(id=" + this.id + ", xpriv=" + this.xpriv + ", xpub=" + this.xpub + ", status=" + this.status + ")";
    }

    public DeletedWalletEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.xpriv = str2;
        this.xpub = str3;
        this.status = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:9) call: com.okinc.business.defi.biz.database.extra.entity.DeletedWalletEntity.<init>(java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ DeletedWalletEntity(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
