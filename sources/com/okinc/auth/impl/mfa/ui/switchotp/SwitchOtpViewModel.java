package com.okinc.auth.impl.mfa.ui.switchotp;

import android.os.CountDownTimer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.auth.impl.mfa.model.SwitchVerificationMethodRequest;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SwitchOtpViewModel extends AbstractC33073mpa {
    public final MutableLiveData<Long> AEQbTJ;
    public final long EZpvd;
    public CountDownTimer OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Long> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public SwitchOtpViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        SwitchVerificationMethodRequest switchVerificationMethodRequest = (SwitchVerificationMethodRequest) savedStateHandle.get("KEY_REQUEST");
        long jLongValue = (switchVerificationMethodRequest == null || (lValueOf = switchVerificationMethodRequest.valueOf()) == null) ? 0L : lValueOf.longValue();
        this.EZpvd = jLongValue;
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData;
        if (jLongValue > 0) {
            EZpvd(jLongValue * ((long) 1000));
        } else {
            mutableLiveData.postValue(0L);
        }
    }

    public static final class Activity extends CountDownTimer {
        public final /* synthetic */ SwitchOtpViewModel AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(long j, SwitchOtpViewModel switchOtpViewModel) {
            super(j, 1000L);
            this.AEQbTJ = switchOtpViewModel;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.AEQbTJ.AEQbTJ.postValue(Long.valueOf(j / ((long) 1000)));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.AEQbTJ.AEQbTJ.postValue(0L);
        }
    }

    public final void EZpvd(long j) {
        this.OLrzqt = new Activity(j, this).start();
    }

    public final void KWHzl() {
        CountDownTimer countDownTimer = this.OLrzqt;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        KWHzl();
    }
}
