package com.okinc.kyc.api.biz.bean;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o.rTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class IdentityTypeConfig extends BaseObservable implements Serializable {
    public static final int $stable = 8;
    private String certCountry;
    private String countryId;
    private String currentCountry;
    private int imageNum;
    private ArrayList<Integer> imageTypes;
    private int value = -1;
    private String label = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCertCountry() {
        return this.certCountry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryId() {
        return this.countryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentCountry() {
        return this.currentCountry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getImageNum() {
        return this.imageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Bindable
    public final ArrayList<Integer> getImageTypes() {
        return this.imageTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Bindable
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCertCountry(String str) {
        this.certCountry = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountryId(String str) {
        this.countryId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentCountry(String str) {
        this.currentCountry = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageNum(int i) {
        this.imageNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(int i) {
        this.value = i;
    }

    public final void setLabel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.label = str;
        notifyPropertyChanged(rTP.AEQbTJ);
    }

    public final void setImageTypes(ArrayList<Integer> arrayList) {
        this.imageTypes = arrayList;
        notifyPropertyChanged(rTP.KWHzl);
    }

    public final void copy(@NotNull IdentityTypeConfig identityTypeConfig) {
        Intrinsics.checkNotNullParameter(identityTypeConfig, "");
        this.value = identityTypeConfig.value;
        setLabel(identityTypeConfig.getLabel());
        setImageTypes(identityTypeConfig.getImageTypes());
        this.certCountry = identityTypeConfig.certCountry;
    }

    public final void clear() {
        this.value = 0;
        setLabel("");
        setImageTypes(null);
        this.certCountry = null;
    }
}
