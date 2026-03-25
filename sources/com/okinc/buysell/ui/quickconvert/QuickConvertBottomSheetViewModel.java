package com.okinc.buysell.ui.quickconvert;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.buysell.api.QuickConvertBottomSheetSubmissionStatus;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C31943mJr;
import o.C32989mnw;
import o.C3634Ape;
import o.mHA;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.ConvertBottomSheetAction;
import uniffi.buy_sell.ConvertOrderStatus;

/* JADX INFO: loaded from: classes7.dex */
public final class QuickConvertBottomSheetViewModel extends C31943mJr {
    public final MutableLiveData<C32989mnw<Unit>> AEQbTJ;
    public boolean EZpvd;
    public final MutableLiveData<C32989mnw<Boolean>> KWHzl;
    public final C3634Ape OLrzqt;
    public QuickConvertBottomSheetSubmissionStatus copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuickConvertBottomSheetSubmissionStatus EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public QuickConvertBottomSheetViewModel(@NotNull C3634Ape c3634Ape) {
        Intrinsics.checkNotNullParameter(c3634Ape, "");
        this.OLrzqt = c3634Ape;
        this.AEQbTJ = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.copydefault = QuickConvertBottomSheetSubmissionStatus.SUCCESS;
    }

    public final void copydefault() {
        mHA.OLrzqt.KWHzl(this.AEQbTJ);
    }

    public final void KWHzl(boolean z) {
        mHA.OLrzqt.OLrzqt(this.KWHzl, Boolean.valueOf(z));
    }

    public final void copydefault(boolean z) {
        QuickConvertBottomSheetSubmissionStatus quickConvertBottomSheetSubmissionStatus;
        if (z) {
            quickConvertBottomSheetSubmissionStatus = QuickConvertBottomSheetSubmissionStatus.SUCCESS;
        } else {
            quickConvertBottomSheetSubmissionStatus = QuickConvertBottomSheetSubmissionStatus.FAILED;
        }
        this.copydefault = quickConvertBottomSheetSubmissionStatus;
    }

    public final void AEQbTJ() {
        ConvertOrderStatus convertOrderStatus;
        ConvertBottomSheetAction convertBottomSheetAction;
        this.EZpvd = true;
        QuickConvertBottomSheetSubmissionStatus quickConvertBottomSheetSubmissionStatus = this.copydefault;
        QuickConvertBottomSheetSubmissionStatus quickConvertBottomSheetSubmissionStatus2 = QuickConvertBottomSheetSubmissionStatus.SUCCESS;
        if (quickConvertBottomSheetSubmissionStatus == quickConvertBottomSheetSubmissionStatus2) {
            convertOrderStatus = ConvertOrderStatus.SUCCESS;
        } else {
            convertOrderStatus = ConvertOrderStatus.FAILURE;
        }
        if (quickConvertBottomSheetSubmissionStatus == quickConvertBottomSheetSubmissionStatus2) {
            convertBottomSheetAction = ConvertBottomSheetAction.REVIEW_DETAILS;
        } else {
            convertBottomSheetAction = ConvertBottomSheetAction.DONE;
        }
        this.OLrzqt.copydefault(convertOrderStatus, convertBottomSheetAction);
    }

    public final void gEmmrt() {
        ConvertOrderStatus convertOrderStatus;
        if (this.EZpvd) {
            this.EZpvd = false;
            return;
        }
        if (this.copydefault == QuickConvertBottomSheetSubmissionStatus.SUCCESS) {
            convertOrderStatus = ConvertOrderStatus.SUCCESS;
        } else {
            convertOrderStatus = ConvertOrderStatus.FAILURE;
        }
        this.OLrzqt.copydefault(convertOrderStatus, ConvertBottomSheetAction.DISMISS);
    }
}
