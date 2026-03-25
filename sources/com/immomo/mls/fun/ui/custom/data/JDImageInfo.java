package com.immomo.mls.fun.ui.custom.data;

import android.content.Context;
import android.text.TextUtils;
import com.immomo.mls.fun.ui.custom.JColor;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Objects;
import o.C43045rhq;
import o.C7350aiF;
import o.C7911ask;

/* JADX INFO: loaded from: classes14.dex */
public class JDImageInfo {
    private static final String IMAGE_PATH = "images/";
    private String absolutePath;
    private Boolean autoMirrored;
    private String imagePath;
    public String initialPlaceHolderName;
    public boolean isAvatar;
    private boolean isLocal;
    private boolean isTemp;
    private boolean isThemed;
    private C43045rhq miniAppResourceLoader;
    private String name;
    private int okIcon;
    private C7350aiF size;
    private JColor tintColor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAbsolutePath() {
        return this.absolutePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getLocalUrl() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43045rhq getMiniAppResourceLoader() {
        return this.miniAppResourceLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNetUrl() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getOkIcon() {
        return this.okIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7350aiF getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JColor getTintColor() {
        return this.tintColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasNight() {
        return this.isThemed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Boolean isAutoMirrored() {
        return this.autoMirrored;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isLocal() {
        return this.isLocal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isNeedTint() {
        return this.isTemp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isNetUrl() {
        return !this.isLocal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isTemp() {
        return this.isTemp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isThemed() {
        return this.isThemed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAbsolutePath(String str) {
        this.absolutePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAutoMirrored(Boolean bool) {
        this.autoMirrored = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLocal(boolean z) {
        this.isLocal = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMiniAppResourceLoader(C43045rhq c43045rhq) {
        this.miniAppResourceLoader = c43045rhq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOkIcon(int i) {
        this.okIcon = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSize(C7350aiF c7350aiF) {
        this.size = c7350aiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTemp(boolean z) {
        this.isTemp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setThemed(boolean z) {
        this.isThemed = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTintColor(JColor jColor) {
        this.tintColor = jColor;
    }

    public JDImageInfo(String str, boolean z, boolean z2, boolean z3, JColor jColor) {
        this.name = str;
        this.isLocal = z;
        this.isTemp = z2;
        this.isThemed = z3;
        this.tintColor = jColor;
    }

    public String getImagePath() {
        return !TextUtils.isEmpty(this.imagePath) ? this.imagePath : IMAGE_PATH;
    }

    public String getLocalPath(Context context, String str) {
        String str2 = (C7911ask.AEQbTJ(context) && hasNight()) ? "_night" : "";
        String localUrl = getLocalUrl();
        if (!TextUtils.isEmpty(localUrl)) {
            String[] strArrSplit = localUrl.split("\\.");
            if (strArrSplit.length >= 2) {
                return getImagePath() + strArrSplit[0] + str2 + JwtUtilsKt.JWT_DELIMITER + strArrSplit[1];
            }
        }
        return getImagePath() + getLocalUrl() + str2 + "@3x" + str;
    }

    public String getDayLocalPath(String str) {
        return getImagePath() + getLocalUrl() + "@3x" + str;
    }

    public String getNightLocalPath(String str) {
        return getImagePath() + getLocalUrl() + "_night@3x" + str;
    }

    public void setImagePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.imagePath = str;
        if (str.endsWith("/")) {
            return;
        }
        this.imagePath += "/";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JDImageInfo jDImageInfo = (JDImageInfo) obj;
        return this.isLocal == jDImageInfo.isLocal && this.isThemed == jDImageInfo.isThemed && this.isTemp == jDImageInfo.isTemp && Objects.equals(this.name, jDImageInfo.name) && Objects.equals(this.tintColor, jDImageInfo.tintColor) && Objects.equals(this.imagePath, jDImageInfo.imagePath);
    }

    public int hashCode() {
        String str = this.name;
        boolean z = this.isLocal;
        boolean z2 = this.isThemed;
        boolean z3 = this.isTemp;
        return Objects.hash(str, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), this.tintColor, this.imagePath);
    }
}
