package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class PsbtsModuleModel extends BaseModel<Psbts> {
    public static final int $stable = 0;

    public PsbtsModuleModel() {
        super("psbts");
    }

    public static final class Psbts {
        public static final int $stable = 8;
        private final List<PsbtHex> psbtHexs;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.PsbtsModuleModel$Psbts */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Psbts copy$default(Psbts psbts, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = psbts.psbtHexs;
            }
            return psbts.copy(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<PsbtHex> component1() {
            return this.psbtHexs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Psbts copy(@NotNull List<PsbtHex> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Psbts(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Psbts) && Intrinsics.EZpvd(this.psbtHexs, ((Psbts) obj).psbtHexs);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<PsbtHex> getPsbtHexs() {
            return this.psbtHexs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.psbtHexs.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Psbts(psbtHexs=" + this.psbtHexs + ")";
        }

        public Psbts(@NotNull List<PsbtHex> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.psbtHexs = list;
        }
    }

    public static final class PsbtHex {
        public static final int $stable = 8;
        private final List<BaseModel<?>> moduleList;
        private final String psbtHex;
        private final String txTitle;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.PsbtsModuleModel$PsbtHex */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PsbtHex copy$default(PsbtHex psbtHex, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = psbtHex.txTitle;
            }
            if ((i & 2) != 0) {
                str2 = psbtHex.psbtHex;
            }
            if ((i & 4) != 0) {
                list = psbtHex.moduleList;
            }
            return psbtHex.copy(str, str2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.txTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.psbtHex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<BaseModel<?>> component3() {
            return this.moduleList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PsbtHex copy(@NotNull String str, @NotNull String str2, List<? extends BaseModel<?>> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new PsbtHex(str, str2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PsbtHex)) {
                return false;
            }
            PsbtHex psbtHex = (PsbtHex) obj;
            return Intrinsics.EZpvd((Object) this.txTitle, (Object) psbtHex.txTitle) && Intrinsics.EZpvd((Object) this.psbtHex, (Object) psbtHex.psbtHex) && Intrinsics.EZpvd(this.moduleList, psbtHex.moduleList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<BaseModel<?>> getModuleList() {
            return this.moduleList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPsbtHex() {
            return this.psbtHex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTxTitle() {
            return this.txTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.txTitle.hashCode();
            int iHashCode2 = this.psbtHex.hashCode();
            List<BaseModel<?>> list = this.moduleList;
            return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PsbtHex(txTitle=" + this.txTitle + ", psbtHex=" + this.psbtHex + ", moduleList=" + this.moduleList + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public PsbtHex(@NotNull String str, @NotNull String str2, List<? extends BaseModel<?>> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.txTitle = str;
            this.psbtHex = str2;
            this.moduleList = list;
        }
    }
}
