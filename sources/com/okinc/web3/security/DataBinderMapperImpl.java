package com.okinc.web3.security;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.web3.security.databinding.ActivityBackupPrivateKeyBindingImpl;
import com.okinc.web3.security.databinding.ActivityBackupShowMnemonicBindingImpl;
import com.okinc.web3.security.databinding.ActivityWeb3SecurityWalletImportBindingImpl;
import com.okinc.web3.security.databinding.DialogPrivateKeyBindingImpl;
import com.okinc.web3.security.databinding.FragmentBackupCheckMnemonicBindingImpl;
import com.okinc.web3.security.databinding.FragmentBackupShowMnemonicBindingImpl;
import com.okinc.web3.security.databinding.FragmentCopyPrivateKeyProtectBindingImpl;
import com.okinc.web3.security.databinding.ItemBackupPrivateKeyBindingImpl;
import com.okinc.web3.security.databinding.ItemCollisionBindingImpl;
import com.okinc.web3.security.databinding.ItemMpcPrivateKeyBindingImpl;
import com.okinc.web3.security.databinding.ItemMpcPrivateKeyHeaderBindingImpl;
import com.okinc.web3.security.databinding.Web3SecurityLoadingLayoutBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray AEQbTJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(12);
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C57407yho.StateListAnimator.KWHzl, 1);
        sparseIntArray.put(C57407yho.StateListAnimator.AEQbTJ, 2);
        sparseIntArray.put(C57407yho.StateListAnimator.OLrzqt, 3);
        sparseIntArray.put(C57407yho.StateListAnimator.EZpvd, 4);
        sparseIntArray.put(C57407yho.StateListAnimator.djBIcL, 5);
        sparseIntArray.put(C57407yho.StateListAnimator.AYXKKw, 6);
        sparseIntArray.put(C57407yho.StateListAnimator.valueOf, 7);
        sparseIntArray.put(C57407yho.StateListAnimator.AkhnZx, 8);
        sparseIntArray.put(C57407yho.StateListAnimator.isConnected, 9);
        sparseIntArray.put(C57407yho.StateListAnimator.ejfBZ, 10);
        sparseIntArray.put(C57407yho.StateListAnimator.AuCTel, 11);
        sparseIntArray.put(C57407yho.StateListAnimator.fARcdN, 12);
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
                if ("layout/activity_backup_private_key_0".equals(tag)) {
                    return new ActivityBackupPrivateKeyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_backup_private_key is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_backup_show_mnemonic_0".equals(tag)) {
                    return new ActivityBackupShowMnemonicBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_backup_show_mnemonic is invalid. Received: " + tag);
            case 3:
                if ("layout/activity_web3_security_wallet_import_0".equals(tag)) {
                    return new ActivityWeb3SecurityWalletImportBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_web3_security_wallet_import is invalid. Received: " + tag);
            case 4:
                if ("layout/dialog_private_key_0".equals(tag)) {
                    return new DialogPrivateKeyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_private_key is invalid. Received: " + tag);
            case 5:
                if ("layout/fragment_backup_check_mnemonic_0".equals(tag)) {
                    return new FragmentBackupCheckMnemonicBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_backup_check_mnemonic is invalid. Received: " + tag);
            case 6:
                if ("layout/fragment_backup_show_mnemonic_0".equals(tag)) {
                    return new FragmentBackupShowMnemonicBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_backup_show_mnemonic is invalid. Received: " + tag);
            case 7:
                if ("layout/fragment_copy_private_key_protect_0".equals(tag)) {
                    return new FragmentCopyPrivateKeyProtectBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_copy_private_key_protect is invalid. Received: " + tag);
            case 8:
                if ("layout/item_backup_private_key_0".equals(tag)) {
                    return new ItemBackupPrivateKeyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_backup_private_key is invalid. Received: " + tag);
            case 9:
                if ("layout/item_collision_0".equals(tag)) {
                    return new ItemCollisionBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for item_collision is invalid. Received: " + tag);
            case 10:
                if ("layout/item_mpc_private_key_0".equals(tag)) {
                    return new ItemMpcPrivateKeyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_mpc_private_key is invalid. Received: " + tag);
            case 11:
                if ("layout/item_mpc_private_key_header_0".equals(tag)) {
                    return new ItemMpcPrivateKeyHeaderBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_mpc_private_key_header is invalid. Received: " + tag);
            case 12:
                if ("layout/web3_security_loading_layout_0".equals(tag)) {
                    return new Web3SecurityLoadingLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for web3_security_loading_layout is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr == null || viewArr.length == 0 || (i2 = AEQbTJ.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 9) {
            return null;
        }
        if ("layout/item_collision_0".equals(tag)) {
            return new ItemCollisionBindingImpl(dataBindingComponent, viewArr);
        }
        throw new IllegalArgumentException("The tag for item_collision is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = Application.OLrzqt.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return StateListAnimator.EZpvd.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3Uilib.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class StateListAnimator {
        public static final SparseArray<String> EZpvd;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(14);
            EZpvd = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "adapter");
            sparseArray.put(3, "content");
            sparseArray.put(4, "dataHolder");
            sparseArray.put(5, "itemData");
            sparseArray.put(6, "itemDecoration");
            sparseArray.put(7, "layoutManager");
            sparseArray.put(8, "leftButton");
            sparseArray.put(9, "privateKeyInfo");
            sparseArray.put(10, "rightButton");
            sparseArray.put(11, "showCloseButton");
            sparseArray.put(12, "singelButton");
            sparseArray.put(13, "title");
        }
    }

    public static class Application {
        public static final HashMap<String, Integer> OLrzqt;

        static {
            HashMap<String, Integer> map = new HashMap<>(12);
            OLrzqt = map;
            map.put("layout/activity_backup_private_key_0", Integer.valueOf(C57407yho.StateListAnimator.KWHzl));
            map.put("layout/activity_backup_show_mnemonic_0", Integer.valueOf(C57407yho.StateListAnimator.AEQbTJ));
            map.put("layout/activity_web3_security_wallet_import_0", Integer.valueOf(C57407yho.StateListAnimator.OLrzqt));
            map.put("layout/dialog_private_key_0", Integer.valueOf(C57407yho.StateListAnimator.EZpvd));
            map.put("layout/fragment_backup_check_mnemonic_0", Integer.valueOf(C57407yho.StateListAnimator.djBIcL));
            map.put("layout/fragment_backup_show_mnemonic_0", Integer.valueOf(C57407yho.StateListAnimator.AYXKKw));
            map.put("layout/fragment_copy_private_key_protect_0", Integer.valueOf(C57407yho.StateListAnimator.valueOf));
            map.put("layout/item_backup_private_key_0", Integer.valueOf(C57407yho.StateListAnimator.AkhnZx));
            map.put("layout/item_collision_0", Integer.valueOf(C57407yho.StateListAnimator.isConnected));
            map.put("layout/item_mpc_private_key_0", Integer.valueOf(C57407yho.StateListAnimator.ejfBZ));
            map.put("layout/item_mpc_private_key_header_0", Integer.valueOf(C57407yho.StateListAnimator.AuCTel));
            map.put("layout/web3_security_loading_layout_0", Integer.valueOf(C57407yho.StateListAnimator.fARcdN));
        }
    }
}
