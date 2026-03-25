package com.okinc.share.bean;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FootViewData {
    public static final int $stable = 8;
    private Drawable logo;
    private String qrcode;
    private CharSequence subtitle;
    private CharSequence title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FootViewData copy$default(FootViewData footViewData, CharSequence charSequence, CharSequence charSequence2, String str, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = footViewData.title;
        }
        if ((i & 2) != 0) {
            charSequence2 = footViewData.subtitle;
        }
        if ((i & 4) != 0) {
            str = footViewData.qrcode;
        }
        if ((i & 8) != 0) {
            drawable = footViewData.logo;
        }
        return footViewData.copy(charSequence, charSequence2, str, drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component2() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.qrcode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component4() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FootViewData copy(CharSequence charSequence, CharSequence charSequence2, String str, Drawable drawable) {
        return new FootViewData(charSequence, charSequence2, str, drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FootViewData)) {
            return false;
        }
        FootViewData footViewData = (FootViewData) obj;
        return Intrinsics.EZpvd(this.title, footViewData.title) && Intrinsics.EZpvd(this.subtitle, footViewData.subtitle) && Intrinsics.EZpvd((Object) this.qrcode, (Object) footViewData.qrcode) && Intrinsics.EZpvd(this.logo, footViewData.logo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQrcode() {
        return this.qrcode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CharSequence charSequence = this.title;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        CharSequence charSequence2 = this.subtitle;
        int iHashCode2 = charSequence2 == null ? 0 : charSequence2.hashCode();
        String str = this.qrcode;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Drawable drawable = this.logo;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (drawable != null ? drawable.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(Drawable drawable) {
        this.logo = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQrcode(String str) {
        this.qrcode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubtitle(CharSequence charSequence) {
        this.subtitle = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(CharSequence charSequence) {
        this.title = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = this.subtitle;
        return "FootViewData(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", qrcode=" + this.qrcode + ", logo=" + this.logo + ")";
    }

    public FootViewData(CharSequence charSequence, CharSequence charSequence2, String str, Drawable drawable) {
        this.title = charSequence;
        this.subtitle = charSequence2;
        this.qrcode = str;
        this.logo = drawable;
    }
}
