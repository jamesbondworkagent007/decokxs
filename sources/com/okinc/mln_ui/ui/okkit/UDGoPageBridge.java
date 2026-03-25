package com.okinc.mln_ui.ui.okkit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.widget.PopupWindowCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.mln_ui.ui.okkit.UDGoPageBridge;
import com.okinc.web.WebActivity;
import com.okinc.web.bean.WebShareInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.AbstractC43238rlX;
import o.C32113mPz;
import o.C33584mzH;
import o.C43056riA;
import o.C43073riR;
import o.C43101rit;
import o.C43145rjk;
import o.C43251rlk;
import o.C52761wXj;
import o.C7322ahe;
import o.C7343ahz;
import o.C7865arr;
import o.C8017aul;
import o.InterfaceC33441mwX;
import o.InterfaceC35205nqt;
import o.InterfaceC43294rma;
import o.InterfaceC7379aii;
import o.InterfaceC7380aij;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class UDGoPageBridge implements InterfaceC7379aii {
    public static final String LUA_CLASS_NAME = "OKRoute";
    public static final int NFT_TAB_INDEX = 1;
    public static final String PARAM_ROOT_ID = "params_root_id";
    public static C43101rit registry;
    public Globals globals;
    public C33584mzH mPopupWindow;

    @LuaBridge
    public int property;
    public static Map<String, PopupWindow> nftPopupWindowMap = new HashMap();
    public static Map<String, C43073riR> nftBottomDialogMap = new HashMap();
    public static Map<String, DialogFragment> nftPageMap = new HashMap();
    public static Map<String, WeakReference<Activity>> nftActivityMap = new ConcurrentHashMap();

    public static /* synthetic */ Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        return null;
    }

    public static /* synthetic */ Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        return null;
    }

    @LuaBridge
    public void pop(View view, boolean z) {
    }

    public UDGoPageBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    public Context copydefault(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    public final C43101rit gEmmrt() {
        if (registry == null) {
            C43101rit c43101rit = new C43101rit();
            registry = c43101rit;
            c43101rit.AYXKKw();
        }
        return registry;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    @LuaBridge
    public void gotoPage(String str, HashMap<String, Object> map) {
        if (str.equals("Browser")) {
            String str2 = (String) map.get("url");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str2));
            djBIcL().startActivity(intent);
            return;
        }
        if (str.equals("Web")) {
            final LuaFunction luaFunction = (LuaFunction) map.get("onClose");
            String str3 = (String) map.get("title");
            Bundle bundle = new Bundle();
            if (map.get("showShare") != null && ((Boolean) map.get("showShare")).booleanValue()) {
                WebShareInfo webShareInfo = new WebShareInfo();
                webShareInfo.setShareLink((String) map.get("shareUrl"));
                webShareInfo.setShareTitle((String) map.get("shareTitle"));
                webShareInfo.setShareText((String) map.get("shareBody"));
                bundle.putBoolean("share", true);
                bundle.putParcelable("share_info", webShareInfo);
            } else if (map.get("showShare") != null) {
                bundle.putBoolean("share", false);
            }
            bundle.putBoolean("SHOW_CLOSE", map.get("showCloseButton") != null && ((Boolean) map.get("showCloseButton")).booleanValue());
            bundle.putString("title", str3);
            bundle.putString("url", (String) map.get("url"));
            Object obj = map.get("animation");
            if ((obj instanceof Integer) && ((Integer) obj).intValue() != 1) {
                bundle.putIntArray("TRANSITION_ANIM", new int[]{0, C52761wXj.Application.AuCTel});
            }
            if (map.containsKey("subdomainstrategy")) {
                bundle.putString("subdomainstrategy", (String) map.get("subdomainstrategy"));
            }
            if (map.containsKey("overridentheme")) {
                Object obj2 = map.get("overridentheme");
                if (obj2 instanceof String) {
                    bundle.putString("overridentheme", (String) obj2);
                }
            }
            Activity activityDjBIcL = djBIcL();
            if (activityDjBIcL instanceof InterfaceC33441mwX) {
                Intent intent2 = new Intent(activityDjBIcL, (Class<?>) WebActivity.class);
                intent2.putExtras(bundle);
                ((InterfaceC33441mwX) activityDjBIcL).launchForResult(intent2, new ActivityResultCallback() { // from class: o.rjy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(java.lang.Object obj3) {
                        UDGoPageBridge.OLrzqt(luaFunction, (ActivityResult) obj3);
                    }
                });
                return;
            }
            KWHzl(bundle);
            return;
        }
        if ("GoToDeeplinkJump".equals(str) && map != null) {
            Object obj3 = map.get("jumpUrl");
            if (obj3 != null) {
                ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(copydefault(this.globals), (String) obj3, map, new Function1() { // from class: o.rjx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj4) {
                        return UDGoPageBridge.copydefault((AbstractC43238rlX) obj4);
                    }
                });
                return;
            }
            return;
        }
        InterfaceC7380aij interfaceC7380aijCopydefault = gEmmrt().copydefault(str);
        if (interfaceC7380aijCopydefault != null) {
            interfaceC7380aijCopydefault.copydefault(copydefault(this.globals), str, map, this);
        }
    }

    public static /* synthetic */ void OLrzqt(LuaFunction luaFunction, ActivityResult activityResult) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    public final void KWHzl(Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                map.put(str, bundle.get(str));
            }
        }
        ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(copydefault(this.globals), "web", map, new Function1() { // from class: o.rjA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDGoPageBridge.OLrzqt((AbstractC43238rlX) obj);
            }
        });
    }

    public static void AEQbTJ() {
        for (Set<String> setKeySet = nftBottomDialogMap.keySet(); setKeySet.size() > 0; setKeySet = nftBottomDialogMap.keySet()) {
            Iterator<String> it = setKeySet.iterator();
            if (it.hasNext()) {
                String next = it.next();
                try {
                    nftBottomDialogMap.get(next).dismiss();
                    nftBottomDialogMap.remove(next);
                } catch (Exception unused) {
                }
            }
        }
        for (Set<String> setKeySet2 = nftPopupWindowMap.keySet(); setKeySet2.size() > 0; setKeySet2 = nftPopupWindowMap.keySet()) {
            Iterator<String> it2 = setKeySet2.iterator();
            if (it2.hasNext()) {
                String next2 = it2.next();
                try {
                    nftBottomDialogMap.get(next2).dismissAllowingStateLoss();
                    nftBottomDialogMap.remove(next2);
                } catch (Exception unused2) {
                }
            }
        }
        for (Set<String> setKeySet3 = nftPageMap.keySet(); setKeySet3.size() > 0; setKeySet3 = nftPageMap.keySet()) {
            Iterator<String> it3 = setKeySet3.iterator();
            if (it3.hasNext()) {
                String next3 = it3.next();
                try {
                    nftPageMap.get(next3).dismissAllowingStateLoss();
                    nftPageMap.remove(next3);
                } catch (Exception unused3) {
                }
            }
        }
    }

    public static void OLrzqt(String str) {
        int i = 0;
        int i2 = 0;
        for (Set<String> setKeySet = nftBottomDialogMap.keySet(); setKeySet.size() > i2; setKeySet = nftBottomDialogMap.keySet()) {
            Iterator<String> it = setKeySet.iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (TextUtils.equals(next, str)) {
                        i2 = 1;
                    } else {
                        try {
                            nftBottomDialogMap.get(next).dismiss();
                            nftBottomDialogMap.remove(next);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        int i3 = 0;
        for (Set<String> setKeySet2 = nftPopupWindowMap.keySet(); setKeySet2.size() > i3; setKeySet2 = nftPopupWindowMap.keySet()) {
            Iterator<String> it2 = setKeySet2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String next2 = it2.next();
                    if (TextUtils.equals(next2, str)) {
                        i3 = 1;
                    } else {
                        try {
                            nftBottomDialogMap.get(next2).dismissAllowingStateLoss();
                            nftBottomDialogMap.remove(next2);
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        }
        for (Set<String> setKeySet3 = nftPageMap.keySet(); setKeySet3.size() > i; setKeySet3 = nftPageMap.keySet()) {
            Iterator<String> it3 = setKeySet3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    String next3 = it3.next();
                    if (TextUtils.equals(next3, str)) {
                        i = 1;
                    } else {
                        try {
                            nftPageMap.get(next3).dismissAllowingStateLoss();
                            nftPageMap.remove(next3);
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    @LuaBridge
    public void dismissAllPageExcept(String str) {
        dismissAllPageExcept(str);
    }

    @Override // o.InterfaceC7379aii
    public void EZpvd() {
        for (Set<String> setKeySet = nftBottomDialogMap.keySet(); setKeySet.size() > 0; setKeySet = nftBottomDialogMap.keySet()) {
            Iterator<String> it = setKeySet.iterator();
            if (it.hasNext()) {
                try {
                    dismiss(it.next(), true, null);
                } catch (Exception unused) {
                }
            }
        }
        for (Set<String> setKeySet2 = nftPopupWindowMap.keySet(); setKeySet2.size() > 0; setKeySet2 = nftPopupWindowMap.keySet()) {
            Iterator<String> it2 = setKeySet2.iterator();
            if (it2.hasNext()) {
                try {
                    dismiss(it2.next(), true, null);
                } catch (Exception unused2) {
                }
            }
        }
        for (Set<String> setKeySet3 = nftPageMap.keySet(); setKeySet3.size() > 0; setKeySet3 = nftPageMap.keySet()) {
            Iterator<String> it3 = setKeySet3.iterator();
            if (it3.hasNext()) {
                String next = it3.next();
                try {
                    dismiss(next, true, null);
                } catch (Exception unused3) {
                    AEQbTJ(next);
                }
            }
        }
    }

    public final void AEQbTJ(String str) {
        try {
            DialogFragment dialogFragment = nftPageMap.get(str);
            if (dialogFragment != null) {
                dialogFragment.getParentFragmentManager().beginTransaction().remove(dialogFragment).commitAllowingStateLoss();
            }
            nftPageMap.remove(str);
        } catch (Exception unused) {
        }
    }

    @LuaBridge
    public void closeSelf(LuaValue[] luaValueArr) {
        ((Activity) copydefault(this.globals)).finish();
    }

    @LuaBridge
    public String push(LuaValue[] luaValueArr) {
        LuaFunction luaFunction;
        boolean z = false;
        String javaString = null;
        View view = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (View) C8017aul.AEQbTJ(luaValueArr[0], View.class);
        if (luaValueArr.length <= 2 || luaValueArr[2].isNil()) {
            luaFunction = null;
        } else {
            luaFunction = (LuaFunction) (luaValueArr.length > 2 ? luaValueArr[2] : null);
        }
        String javaString2 = (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : luaValueArr[3].toJavaString();
        if (luaValueArr.length > 4 && !luaValueArr[4].isNil()) {
            javaString = luaValueArr[4].toJavaString();
        }
        String str = javaString;
        boolean z2 = (luaValueArr.length <= 5 || !luaValueArr[5].isBoolean()) ? false : luaValueArr[5].toBoolean();
        if (luaValueArr.length > 6 && luaValueArr[6].isBoolean()) {
            z = luaValueArr[6].toBoolean();
        }
        AEQbTJ(view, luaFunction, javaString2, str, z2, z);
        return view.hashCode() + "";
    }

    @LuaBridge
    public String pushWithLifeCycle(LuaValue[] luaValueArr) {
        LuaFunction luaFunction;
        boolean z = false;
        String javaString = null;
        View view = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (View) C8017aul.AEQbTJ(luaValueArr[0], View.class);
        if (luaValueArr.length <= 2 || luaValueArr[2].isNil()) {
            luaFunction = null;
        } else {
            luaFunction = (LuaFunction) (luaValueArr.length > 2 ? luaValueArr[2] : null);
        }
        String javaString2 = (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : luaValueArr[3].toJavaString();
        if (luaValueArr.length > 4 && !luaValueArr[4].isNil()) {
            javaString = luaValueArr[4].toJavaString();
        }
        String str = javaString;
        boolean z2 = (luaValueArr.length <= 5 || !luaValueArr[5].isBoolean()) ? false : luaValueArr[5].toBoolean();
        if (luaValueArr.length > 6 && luaValueArr[6].isBoolean()) {
            z = luaValueArr[6].toBoolean();
        }
        AEQbTJ(view, luaFunction, javaString2, str, z2, z);
        return view.hashCode() + "";
    }

    @LuaBridge
    public String navigate(String str, Map map) {
        if (map == null) {
            map = new HashMap(1);
        }
        String string = UUID.randomUUID().toString();
        map.put(PARAM_ROOT_ID, string);
        OLrzqt(str, map);
        return string;
    }

    @LuaBridge
    public String presentNavigationVC(String str, Map map) {
        if (map == null) {
            map = new HashMap(1);
        }
        map.put("isFadeIn", Boolean.TRUE);
        OLrzqt(str, map);
        return str;
    }

    @LuaBridge
    public void close(LuaValue[] luaValueArr) {
        Activity activityDjBIcL = djBIcL();
        if (activityDjBIcL == null) {
            return;
        }
        activityDjBIcL.finish();
    }

    @LuaBridge
    public String showSheet(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = null;
        boolean z = false;
        View view = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (View) C8017aul.AEQbTJ(luaValueArr[0], View.class);
        boolean z2 = luaValueArr[1].toBoolean();
        luaValueArr[2].toBoolean();
        boolean z3 = luaValueArr[3].toBoolean();
        boolean z4 = luaValueArr.length > 4 ? luaValueArr[4].toBoolean() : false;
        String javaString = (luaValueArr.length <= 5 || luaValueArr[5].isNil()) ? null : luaValueArr[5].toJavaString();
        String javaString2 = (luaValueArr.length <= 6 || luaValueArr[6].isNil()) ? null : luaValueArr[6].toJavaString();
        if (luaValueArr.length > 7 && luaValueArr[7].isFunction()) {
            luaFunction = (LuaFunction) luaValueArr[7];
        }
        LuaFunction luaFunction2 = luaFunction;
        boolean z5 = (luaValueArr.length <= 8 || !luaValueArr[8].isBoolean()) ? false : luaValueArr[8].toBoolean();
        if (luaValueArr.length > 9 && luaValueArr[9].isBoolean()) {
            z = luaValueArr[9].toBoolean();
        }
        copydefault(view, z2, z3, z4, javaString, javaString2, luaFunction2, z5, z);
        return view.hashCode() + "";
    }

    @LuaBridge
    public String present(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = null;
        boolean z = false;
        View view = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (View) C8017aul.AEQbTJ(luaValueArr[0], View.class);
        if (luaValueArr.length > 4 && luaValueArr[4].isFunction()) {
            luaFunction = (LuaFunction) luaValueArr[4];
        }
        LuaFunction luaFunction2 = luaFunction;
        boolean z2 = (luaValueArr.length <= 5 || !luaValueArr[5].isBoolean()) ? false : luaValueArr[5].toBoolean();
        if (luaValueArr.length > 6 && luaValueArr[6].isBoolean()) {
            z = luaValueArr[6].toBoolean();
        }
        copydefault(view, true, false, false, null, null, luaFunction2, z2, z);
        return view.hashCode() + "";
    }

    @LuaBridge
    public String dropDown(View view, View view2, boolean z) {
        copydefault(view, view2, z);
        return view.hashCode() + "";
    }

    @LuaBridge
    public String dropDownWithOffset(View view, View view2, boolean z, int i, int i2, int i3, int i4, int i5) {
        EZpvd(view, view2, z, i, i2, i3, i4, i5);
        return view.hashCode() + "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    @LuaBridge
    public void dismiss(String str, boolean z, LuaValue luaValue) {
        WeakReference<Activity> weakReference;
        Activity activity;
        if (luaValue instanceof LuaFunction) {
            ((LuaFunction) luaValue).OLrzqt();
        }
        if (str == null || str.equals("")) {
            Activity activityDjBIcL = djBIcL();
            if (activityDjBIcL == 0) {
                return;
            }
            if ((activityDjBIcL instanceof InterfaceC35205nqt) && ((InterfaceC35205nqt) activityDjBIcL).AwvSrB()) {
                return;
            }
            activityDjBIcL.finish();
            if (z) {
                return;
            }
            activityDjBIcL.overridePendingTransition(0, 0);
            return;
        }
        Map<String, PopupWindow> map = nftPopupWindowMap;
        if (map != null && !map.isEmpty() && nftPopupWindowMap.containsKey(str)) {
            nftPopupWindowMap.get(str).dismiss();
            nftPopupWindowMap.remove(str);
            return;
        }
        Map<String, C43073riR> map2 = nftBottomDialogMap;
        if (map2 != null && !map2.isEmpty() && nftBottomDialogMap.containsKey(str)) {
            nftBottomDialogMap.get(str).dismissAllowingStateLoss();
            nftBottomDialogMap.remove(str);
            return;
        }
        Map<String, DialogFragment> map3 = nftPageMap;
        if (map3 != null && !map3.isEmpty() && nftPageMap.containsKey(str)) {
            nftPageMap.get(str).dismissAllowingStateLoss();
            nftPageMap.remove(str);
            return;
        }
        Map<String, WeakReference<Activity>> map4 = nftActivityMap;
        if (map4 == null || map4.isEmpty() || (weakReference = nftActivityMap.get(str)) == null || (activity = weakReference.get()) == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.finish();
        nftActivityMap.remove(str);
    }

    public Activity djBIcL() {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    @LuaBridge
    public String showAnchor(View view, View view2, int i, int i2, int i3, boolean z) {
        PopupWindow popupWindow = new PopupWindow(view, -2, -2);
        popupWindow.setOutsideTouchable(z);
        PopupWindowCompat.showAsDropDown(popupWindow, view2, C7865arr.copydefault(i), C7865arr.copydefault(i2), i3);
        Map<String, PopupWindow> map = nftPopupWindowMap;
        if (map != null) {
            map.put(view.hashCode() + "", popupWindow);
        }
        return view.hashCode() + "";
    }

    public void copydefault(final View view, View view2, boolean z) {
        C33584mzH c33584mzH = new C33584mzH(copydefault(this.globals), view, false, true);
        this.mPopupWindow = c33584mzH;
        c33584mzH.EZpvd(new ColorDrawable(ContextCompat.getColor(copydefault(this.globals), C32113mPz.ActionBar.AwvSrB)));
        this.mPopupWindow.setBackgroundDrawable(ContextCompat.getDrawable(copydefault(this.globals), C7343ahz.StateListAnimator.AEQbTJ));
        this.mPopupWindow.showAsDropDown(view2);
        this.mPopupWindow.copydefault(true);
        this.mPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.okinc.mln_ui.ui.okkit.UDGoPageBridge.3
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                if (UDGoPageBridge.nftPopupWindowMap != null) {
                    UDGoPageBridge.nftPopupWindowMap.remove(view.hashCode() + "");
                }
            }
        });
        Map<String, PopupWindow> map = nftPopupWindowMap;
        if (map != null) {
            map.put(view.hashCode() + "", this.mPopupWindow);
        }
    }

    public void EZpvd(final View view, View view2, boolean z, int i, int i2, int i3, int i4, int i5) {
        PopupWindow popupWindow = new PopupWindow(copydefault(this.globals));
        popupWindow.setContentView(view);
        popupWindow.setWidth(C7865arr.OLrzqt(C7865arr.copydefault(i)));
        popupWindow.setHeight(C7865arr.OLrzqt(C7865arr.copydefault(i2)));
        popupWindow.setBackgroundDrawable(ContextCompat.getDrawable(copydefault(this.globals), C7343ahz.StateListAnimator.AEQbTJ));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setElevation(2.0f);
        popupWindow.showAsDropDown(view2, C7865arr.copydefault(i3), C7865arr.copydefault(i4), i5);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.okinc.mln_ui.ui.okkit.UDGoPageBridge.5
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                if (UDGoPageBridge.nftPopupWindowMap != null) {
                    UDGoPageBridge.nftPopupWindowMap.remove(view.hashCode() + "");
                }
            }
        });
        Map<String, PopupWindow> map = nftPopupWindowMap;
        if (map != null) {
            map.put(view.hashCode() + "", popupWindow);
        }
    }

    public void copydefault(final View view, boolean z, boolean z2, boolean z3, String str, String str2, LuaFunction luaFunction, boolean z4, boolean z5) {
        C43073riR c43073riRCopydefault = C43073riR.Companion.copydefault(z ? 1.0f : 0.0f, view, new Function0<Unit>() { // from class: com.okinc.mln_ui.ui.okkit.UDGoPageBridge.1
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public Unit invoke() {
                if (UDGoPageBridge.nftBottomDialogMap == null) {
                    return null;
                }
                UDGoPageBridge.nftBottomDialogMap.remove(view.hashCode() + "");
                return null;
            }
        }, z2, z3, str, str2, luaFunction, Boolean.valueOf(z4), Boolean.valueOf(z5));
        FragmentManager supportFragmentManager = ((FragmentActivity) copydefault(this.globals)).getSupportFragmentManager();
        if (supportFragmentManager.isStateSaved()) {
            return;
        }
        c43073riRCopydefault.show(supportFragmentManager, "");
        Map<String, C43073riR> map = nftBottomDialogMap;
        if (map != null) {
            map.put(view.hashCode() + "", c43073riRCopydefault);
        }
    }

    public void AEQbTJ(final View view, final LuaFunction luaFunction, String str, String str2, boolean z, boolean z2) {
        C43145rjk c43145rjkAEQbTJ = C43145rjk.Companion.AEQbTJ(view, luaFunction, new Function0<Unit>() { // from class: com.okinc.mln_ui.ui.okkit.UDGoPageBridge.4
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public Unit invoke() {
                LuaFunction luaFunction2 = luaFunction;
                if (luaFunction2 != null) {
                    luaFunction2.copydefault("didDealloc");
                }
                if (UDGoPageBridge.nftPageMap == null) {
                    return null;
                }
                UDGoPageBridge.nftPageMap.remove(view.hashCode() + "");
                return null;
            }
        }, str, str2, Boolean.valueOf(z), Boolean.valueOf(z2));
        if (((FragmentActivity) copydefault(this.globals)).getSupportFragmentManager().isStateSaved()) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = ((FragmentActivity) copydefault(this.globals)).getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.addToBackStack(null);
        c43145rjkAEQbTJ.show(fragmentTransactionBeginTransaction, "");
        Map<String, DialogFragment> map = nftPageMap;
        if (map != null) {
            map.put(view.hashCode() + "", c43145rjkAEQbTJ);
        }
    }

    public void OLrzqt(String str, Map map) {
        C43056riA.AEQbTJ.KWHzl(copydefault(this.globals), (Map<String, ? extends Object>) map, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: o.riA */
    /* JADX WARN: Multi-variable type inference failed */
    @LuaBridge
    public String navigateToMiniApp(String str, String str2, Map map) {
        if (map == null) {
            map = new HashMap(1);
        }
        String string = UUID.randomUUID().toString();
        map.put(PARAM_ROOT_ID, string);
        C43056riA.AEQbTJ.copydefault(copydefault(this.globals), str, str2, (Map<String, ? extends Object>) map);
        return string;
    }

    @LuaBridge
    public void presentToMiniApp(String str, String str2, Map map) {
        if (map == null) {
            map = new HashMap(1);
        }
        map.put("isFadeIn", Boolean.TRUE);
        navigateToMiniApp(str, str2, map);
    }

    public static void OLrzqt(String str, Activity activity) {
        if (TextUtils.isEmpty(str) || activity == null) {
            return;
        }
        nftActivityMap.put(str, new WeakReference<>(activity));
    }

    public static void copydefault(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        nftActivityMap.remove(str);
    }
}
