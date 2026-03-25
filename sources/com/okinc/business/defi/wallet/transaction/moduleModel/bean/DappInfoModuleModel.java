package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DappInfoModuleModel extends BaseModel<DappItem> {
    public static final int $stable = 0;

    public DappInfoModuleModel() {
        super("dappInfo");
    }

    public static final class DappItem {
        public static final int $stable = 8;
        private final String host;
        private final String icon;
        private transient Object localIconRes;
        private final String name;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DappItem copy$default(DappItem dappItem, String str, String str2, String str3, String str4, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = dappItem.title;
            }
            if ((i & 2) != 0) {
                str2 = dappItem.icon;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = dappItem.host;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = dappItem.name;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                obj = dappItem.localIconRes;
            }
            return dappItem.copy(str, str5, str6, str7, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.host;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object component5() {
            return this.localIconRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DappItem copy(String str, String str2, String str3, String str4, Object obj) {
            return new DappItem(str, str2, str3, str4, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DappItem)) {
                return false;
            }
            DappItem dappItem = (DappItem) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) dappItem.title) && Intrinsics.EZpvd((Object) this.icon, (Object) dappItem.icon) && Intrinsics.EZpvd((Object) this.host, (Object) dappItem.host) && Intrinsics.EZpvd((Object) this.name, (Object) dappItem.name) && Intrinsics.EZpvd(this.localIconRes, dappItem.localIconRes);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getHost() {
            return this.host;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object getLocalIconRes() {
            return this.localIconRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.title;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.icon;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.host;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.name;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            Object obj = this.localIconRes;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLocalIconRes(Object obj) {
            this.localIconRes = obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DappItem(title=" + this.title + ", icon=" + this.icon + ", host=" + this.host + ", name=" + this.name + ", localIconRes=" + this.localIconRes + ")";
        }

        public DappItem(String str, String str2, String str3, String str4, Object obj) {
            this.title = str;
            this.icon = str2;
            this.host = str3;
            this.name = str4;
            this.localIconRes = obj;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r11v0 java.lang.Object))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void (m)] (LINE:255) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.DappInfoModuleModel.DappItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void type: THIS */
        public /* synthetic */ DappItem(String str, String str2, String str3, String str4, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? null : obj);
        }
    }
}
