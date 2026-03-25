package com.okinc.okex.center.ui.displaymodels;

import com.okinc.okex.center.bean.SelfServiceToolBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC45063sii;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SelfServiceDisplayModel extends AbstractC45063sii {
    public static final int $stable = 8;
    private final CharSequence description;
    private final String iconUrl;
    private final boolean showRedDot;
    private final SelfServiceToolBean sourceBean;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SelfServiceDisplayModel copy$default(SelfServiceDisplayModel selfServiceDisplayModel, SelfServiceToolBean selfServiceToolBean, String str, CharSequence charSequence, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            selfServiceToolBean = selfServiceDisplayModel.sourceBean;
        }
        if ((i & 2) != 0) {
            str = selfServiceDisplayModel.title;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            charSequence = selfServiceDisplayModel.description;
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 8) != 0) {
            z = selfServiceDisplayModel.showRedDot;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = selfServiceDisplayModel.iconUrl;
        }
        return selfServiceDisplayModel.copy(selfServiceToolBean, str3, charSequence2, z2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceToolBean component1() {
        return this.sourceBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component3() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.showRedDot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceDisplayModel copy(@NotNull SelfServiceToolBean selfServiceToolBean, @NotNull String str, CharSequence charSequence, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SelfServiceDisplayModel(selfServiceToolBean, str, charSequence, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfServiceDisplayModel)) {
            return false;
        }
        SelfServiceDisplayModel selfServiceDisplayModel = (SelfServiceDisplayModel) obj;
        return Intrinsics.EZpvd(this.sourceBean, selfServiceDisplayModel.sourceBean) && Intrinsics.EZpvd((Object) this.title, (Object) selfServiceDisplayModel.title) && Intrinsics.EZpvd(this.description, selfServiceDisplayModel.description) && this.showRedDot == selfServiceDisplayModel.showRedDot && Intrinsics.EZpvd((Object) this.iconUrl, (Object) selfServiceDisplayModel.iconUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowRedDot() {
        return this.showRedDot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getSourceBean()Ljava/lang/Object; */
    @Override // o.AbstractC45063sii
    public SelfServiceToolBean getSourceBean() {
        return this.sourceBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC45063sii
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.sourceBean.hashCode();
        int iHashCode2 = this.title.hashCode();
        CharSequence charSequence = this.description;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + Boolean.hashCode(this.showRedDot)) * 31) + this.iconUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        SelfServiceToolBean selfServiceToolBean = this.sourceBean;
        String str = this.title;
        CharSequence charSequence = this.description;
        return "SelfServiceDisplayModel(sourceBean=" + selfServiceToolBean + ", title=" + str + ", description=" + ((Object) charSequence) + ", showRedDot=" + this.showRedDot + ", iconUrl=" + this.iconUrl + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 com.okinc.okex.center.bean.SelfServiceToolBean)
  (r8v0 java.lang.String)
  (r9v0 java.lang.CharSequence)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (r11v0 java.lang.String)
 A[MD:(com.okinc.okex.center.bean.SelfServiceToolBean, java.lang.String, java.lang.CharSequence, boolean, java.lang.String):void (m)] (LINE:17) call: com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel.<init>(com.okinc.okex.center.bean.SelfServiceToolBean, java.lang.String, java.lang.CharSequence, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SelfServiceDisplayModel(SelfServiceToolBean selfServiceToolBean, String str, CharSequence charSequence, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(selfServiceToolBean, str, charSequence, (i & 8) != 0 ? false : z, str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfServiceDisplayModel(@NotNull SelfServiceToolBean selfServiceToolBean, @NotNull String str, CharSequence charSequence, boolean z, @NotNull String str2) {
        super(selfServiceToolBean, str);
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sourceBean = selfServiceToolBean;
        this.title = str;
        this.description = charSequence;
        this.showRedDot = z;
        this.iconUrl = str2;
    }
}
