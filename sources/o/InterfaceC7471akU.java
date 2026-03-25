package o;

import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;

/* JADX INFO: renamed from: o.akU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7471akU {
    boolean AEQbTJ();

    void EZpvd(java.util.List<JDImageInfo> list, long j, boolean z);

    boolean EZpvd();

    JDImageInfo OLrzqt();

    void copydefault();

    void setBgBlurCheck(JDImageInfo jDImageInfo, JDImageInfo jDImageInfo2, boolean z);

    void setBlurImage(float f);

    void setImage(JDImageInfo jDImageInfo);

    void setImageUrlWithPlaceHolder(JDImageInfo jDImageInfo, JDImageInfo jDImageInfo2);

    void setImageUrlWithPlaceHolderAndOriginSize(JDImageInfo jDImageInfo, JDImageInfo jDImageInfo2);

    void setImageWithBase64AndCallback(java.lang.String str, boolean z, UDImageInfo uDImageInfo);

    void setLazyLoad(boolean z);

    void setPlaceHolderNoText(JDImageInfo jDImageInfo, java.lang.String str);
}
