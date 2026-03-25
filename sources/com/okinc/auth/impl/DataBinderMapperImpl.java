package com.okinc.auth.impl;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C5657aAc;
import o.C5659aAe;
import o.C5662aAh;
import o.C5671aAq;
import o.C5673aAs;
import o.C5675aAu;
import o.C8206ayP;
import o.C8216ayZ;
import o.C8246azC;
import o.C8251azH;
import o.C8266azW;
import o.C8276azg;
import o.C8292azw;
import o.C8295azz;

/* JADX INFO: loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray AEQbTJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(13);
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C8206ayP.Application.valueOf, 1);
        sparseIntArray.put(C8206ayP.Application.fetchVPNInfo, 2);
        sparseIntArray.put(C8206ayP.Application.wlaJM, 3);
        sparseIntArray.put(C8206ayP.Application.zLjUOn, 4);
        sparseIntArray.put(C8206ayP.Application.zuBGHE, 5);
        sparseIntArray.put(C8206ayP.Application.AwvSrB, 6);
        sparseIntArray.put(C8206ayP.Application.UeEOUB, 7);
        sparseIntArray.put(C8206ayP.Application.flVtFt, 8);
        sparseIntArray.put(C8206ayP.Application.fvQaOB, 9);
        sparseIntArray.put(C8206ayP.Application.gGvvIC, 10);
        sparseIntArray.put(C8206ayP.Application.AxsJAYsNCnLh, 11);
        sparseIntArray.put(C8206ayP.Application.QKudOq, 12);
        sparseIntArray.put(C8206ayP.Application.RlQdEF, 13);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = AEQbTJ.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i2) {
            case 1:
                if ("layout/activity_passkey_sync_promotion_0".equals(tag)) {
                    return new C8216ayZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_passkey_sync_promotion is invalid. Received: " + tag);
            case 2:
                if ("layout/auth_item_otp_input_0".equals(tag)) {
                    return new C8276azg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for auth_item_otp_input is invalid. Received: " + tag);
            case 3:
                if ("layout/fragment_auth_otp_input_0".equals(tag)) {
                    return new C8292azw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_auth_otp_input is invalid. Received: " + tag);
            case 4:
                if ("layout/fragment_auth_rebind_2fa_0".equals(tag)) {
                    return new C8295azz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_auth_rebind_2fa is invalid. Received: " + tag);
            case 5:
                if ("layout/fragment_auth_rebind_2fa_success_0".equals(tag)) {
                    return new C8246azC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_auth_rebind_2fa_success is invalid. Received: " + tag);
            case 6:
                if ("layout/fragment_auth_reset_result_0".equals(tag)) {
                    return new C8251azH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_auth_reset_result is invalid. Received: " + tag);
            case 7:
                if ("layout/fragment_passkey_authenticate_service_0".equals(tag)) {
                    return new C8266azW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_passkey_authenticate_service is invalid. Received: " + tag);
            case 8:
                if ("layout/fragment_passkey_promotion_service_with_passkey_0".equals(tag)) {
                    return new C5659aAe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_passkey_promotion_service_with_passkey is invalid. Received: " + tag);
            case 9:
                if ("layout/fragment_passkey_promotion_service_with_passkey_stepper_0".equals(tag)) {
                    return new C5657aAc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_passkey_promotion_service_with_passkey_stepper is invalid. Received: " + tag);
            case 10:
                if ("layout/fragment_passkey_promotion_service_without_passkey_0".equals(tag)) {
                    return new C5662aAh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_passkey_promotion_service_without_passkey is invalid. Received: " + tag);
            case 11:
                if ("layout/fragment_security_fido2_authenticator_0".equals(tag)) {
                    return new C5671aAq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_security_fido2_authenticator is invalid. Received: " + tag);
            case 12:
                if ("layout/fragment_security_passkey_already_existed_0".equals(tag)) {
                    return new C5675aAu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_security_passkey_already_existed is invalid. Received: " + tag);
            case 13:
                if ("layout/fragment_security_passkey_okx_pay_0".equals(tag)) {
                    return new C5673aAs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_security_passkey_okx_pay is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || AEQbTJ.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = Application.AEQbTJ.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return TaskDescription.EZpvd.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class TaskDescription {
        public static final SparseArray<String> EZpvd;

        private TaskDescription() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(14);
            EZpvd = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "imageTypes");
            sparseArray.put(4, "isVisible");
            sparseArray.put(5, "itemData");
            sparseArray.put(6, "label");
            sparseArray.put(7, "leftButton");
            sparseArray.put(8, "model");
            sparseArray.put(9, "otpContentViewModel");
            sparseArray.put(10, "rightButton");
            sparseArray.put(11, "showCloseButton");
            sparseArray.put(12, "singelButton");
            sparseArray.put(13, "title");
        }
    }

    public static class Application {
        public static final HashMap<String, Integer> AEQbTJ;

        private Application() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(13);
            AEQbTJ = map;
            map.put("layout/activity_passkey_sync_promotion_0", Integer.valueOf(C8206ayP.Application.valueOf));
            map.put("layout/auth_item_otp_input_0", Integer.valueOf(C8206ayP.Application.fetchVPNInfo));
            map.put("layout/fragment_auth_otp_input_0", Integer.valueOf(C8206ayP.Application.wlaJM));
            map.put("layout/fragment_auth_rebind_2fa_0", Integer.valueOf(C8206ayP.Application.zLjUOn));
            map.put("layout/fragment_auth_rebind_2fa_success_0", Integer.valueOf(C8206ayP.Application.zuBGHE));
            map.put("layout/fragment_auth_reset_result_0", Integer.valueOf(C8206ayP.Application.AwvSrB));
            map.put("layout/fragment_passkey_authenticate_service_0", Integer.valueOf(C8206ayP.Application.UeEOUB));
            map.put("layout/fragment_passkey_promotion_service_with_passkey_0", Integer.valueOf(C8206ayP.Application.flVtFt));
            map.put("layout/fragment_passkey_promotion_service_with_passkey_stepper_0", Integer.valueOf(C8206ayP.Application.fvQaOB));
            map.put("layout/fragment_passkey_promotion_service_without_passkey_0", Integer.valueOf(C8206ayP.Application.gGvvIC));
            map.put("layout/fragment_security_fido2_authenticator_0", Integer.valueOf(C8206ayP.Application.AxsJAYsNCnLh));
            map.put("layout/fragment_security_passkey_already_existed_0", Integer.valueOf(C8206ayP.Application.QKudOq));
            map.put("layout/fragment_security_passkey_okx_pay_0", Integer.valueOf(C8206ayP.Application.RlQdEF));
        }
    }
}
