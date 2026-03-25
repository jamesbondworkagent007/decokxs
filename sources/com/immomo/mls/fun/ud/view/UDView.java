package com.immomo.mls.fun.ud.view;

import android.animation.Animator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ibm.icu.text.DateFormat;
import com.immomo.mls.fun.ud.UDCanvas;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.UDPoint;
import com.immomo.mls.fun.ud.UDRect;
import com.immomo.mls.fun.ud.UDSize;
import com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation;
import com.immomo.mls.fun.ui.custom.JColor;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.immomo.mls.utils.AssertUtils;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C52761wXj;
import o.C55296xhK;
import o.C55360xiV;
import o.C55420xjc;
import o.C57604ylZ;
import o.C6798aWF;
import o.C7322ahe;
import o.C7323ahf;
import o.C7326ahi;
import o.C7328ahk;
import o.C7330ahm;
import o.C7343ahz;
import o.C7348aiD;
import o.C7350aiF;
import o.C7352aiH;
import o.C7460akJ;
import o.C7544alo;
import o.C7823arB;
import o.C7833arL;
import o.C7842arU;
import o.C7864arq;
import o.C7865arr;
import o.C7870arw;
import o.C7910asj;
import o.InterfaceC60044zuT;
import o.InterfaceC7383aim;
import o.InterfaceC7384ain;
import o.InterfaceC7405ajH;
import o.InterfaceC7407ajJ;
import o.InterfaceC7408ajK;
import o.InterfaceC7410ajM;
import o.InterfaceC7776aqH;
import o.InterfaceC7777aqI;
import o.InterfaceC7852are;
import o.InterfaceC7855arh;
import org.luaj.vm2.Globals;
import org.luaj.vm2.JavaUserdata;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public abstract class UDView<V extends View> extends JavaUserdata<V> implements InterfaceC7383aim.ActionBar {
    public static final String[] ORxRYg = {"width", "height", "anchorPoint", "x", DateFormat.YEAR, "bottom", TtmlNode.RIGHT, "marginLeft", "marginTop", "marginRight", "marginBottom", RemoteMessageConst.Notification.PRIORITY, "weight", TypedValues.AttributesType.S_FRAME, "size", "point", "centerX", "centerY", "fitSysWindow", "getCenterX", "getCenterY", "sizeToFit", "removeFromSuper", "superview", "layoutIfNeeded", "padding", "addBlurEffect", "removeBlurEffect", "setGravity", "requestLayout", "setWrapContent", "setMatchParent", "openRipple", "transform", "transformIdentity", Key.ROTATION, "translation", "scale", "setMaxWidth", "setMaxHeight", "setMinWidth", "setMinHeight", "bringSubviewToFront", "sendSubviewToBack", "canEndEditing", "alpha", "borderWidth", "borderColor", "hidden", "gone", "bgColor", "setNineImage", "cornerRadius", "refresh", "setCornerRadiusWithDirection", "addCornerMask", "clipToBounds", "setGradientColorWithDirection", "setGradientColor", "notClip", "enabled", "onTouch", "onClick", "onLongPress", "hasFocus", "canFocus", "requestFocus", "cancelFocus", "setPositionAdjustForKeyboard", "setPositionAdjustForKeyboardAndOffset", "convertRelativePointTo", "convertPointTo", "convertPointFrom", "touchBegin", "touchMove", "touchEnd", "touchCancel", "touchBeginExtension", "touchMoveExtension", "touchEndExtension", "touchCancelExtension", "snapshot", "startAnimation", "clearAnimation", "bgImage", "getCornerRadiusWithDirection", "addShadow", "setShadow", "removeAllAnimation", "onDraw", "onDetachedView", "clipToChildren", "overlay", "expandHeight", "expandWidth", "subviewsCount", "onRootViewDealloc", "limitClick", "locationInWindow", "locationOnScreen", "setTag", "forbiddenFlipInRTL", "ignoreForbiddenFlipInRTL", "setFocusableInTouchMode", "accessibilityId", "setClipChildren", "showSyncSkeleton", "hideSyncSkeleton", "asSkeleton"};
    public static boolean QKVWgx = false;
    public float AxsJAYaxsJAY;
    public boolean AxsJAYsNCnLh;
    public int DAIeex;
    public HashMap DCJXGO;
    public LuaFunction DCUTEI;
    public List<Animator> DTwDnp;
    public LuaFunction DXXBbs;
    public JDImageInfo DarRvM;
    public LuaFunction OBJEWx;
    public UDViewGroup ODWQjV;
    public JColor OcIXYQ;
    public LuaFunction OqFWZa;
    public UDView OuxcSI;
    public View.OnTouchListener QHmsKR;
    public int QKudOq;
    public LuaFunction QSBOWP;
    public Object QUSxYX;
    public LuaFunction QVAiDq;
    public boolean QbewEr;
    public Map<String, LuaFunction> QfsBiF;
    public LuaFunction QkdxfA;
    public boolean RJOkX;
    public LuaFunction RKDWNf;
    public View.OnClickListener RcXXUw;
    public UDCanvas RdAHlO;
    public int RlQdEF;
    public boolean UeEOUB;
    public InterfaceC7852are aKErDB;
    public int accept;
    public final V dHguZz;
    public boolean dNCPSb;
    public LuaFunction djSkpj;
    public LuaFunction dvKsVJ;
    public View.OnLongClickListener dxcTrN;
    public InterfaceC7405ajH fFgQHt;
    public JColor fZBcTu;
    public LuaFunction ffGIBT;
    public boolean finit;
    public int flVtFt;
    public boolean fvQaOB;
    public JColor gGvvIC;
    public JColor gasjUx;
    public LuaFunction getPostValueLengthLimit;
    public boolean giSNqX;
    public float gkJEwt;
    public LuaFunction gwTjWJ;
    public final Activity hBpjJd;
    public float hUfVAv;
    public float iRxXKY;
    public float iZzfmt;
    public LuaFunction zuWLRA;

    public static class Activity {
        public boolean AEQbTJ;
        public int AYXKKw;
        public int AkhnZx;
        public int DbNXlk;
        public int copydefault;
        public int djBIcL;
        public int gEmmrt;
        public int isConnected;
        public int valueOf;
        public float EZpvd = Float.NaN;
        public float KWHzl = Float.NaN;
        public int OLrzqt = 8388659;
        public boolean values = true;
        public int AhwBna = 0;
        public int fetchVPNInfo = 0;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface TaskDescription {
        void OLrzqt(@Nullable LuaFunction luaFunction);
    }

    public abstract V AEQbTJ(@NonNull LuaValue[] luaValueArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AwvSrB() {
        return this.accept;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AxsJAY() {
        return this.RlQdEF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(InterfaceC7405ajH interfaceC7405ajH) {
        this.fFgQHt = interfaceC7405ajH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OcIXYQ() {
        return this.QKudOq;
    }

    @InterfaceC60044zuT
    public LuaValue[] addBlurEffect(LuaValue[] luaValueArr) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public V f_() {
        return this.dHguZz;
    }

    @Override // org.luaj.vm2.LuaUserdata
    public long memoryCast() {
        return PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
    }

    @InterfaceC60044zuT
    public LuaValue[] removeBlurEffect(LuaValue[] luaValueArr) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int sSMYrx() {
        return this.DAIeex;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [T, V extends android.view.View, android.view.View] */
    @InterfaceC60044zuT
    public UDView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.QfsBiF = new HashMap();
        this.hBpjJd = new Activity();
        this.AxsJAYaxsJAY = -1.0f;
        this.iZzfmt = -1.0f;
        this.hUfVAv = -1.0f;
        this.gkJEwt = -1.0f;
        this.iRxXKY = -1.0f;
        this.dNCPSb = false;
        this.UeEOUB = true;
        this.finit = false;
        this.fvQaOB = false;
        this.AxsJAYsNCnLh = false;
        this.giSNqX = false;
        this.QbewEr = false;
        this.QHmsKR = new View.OnTouchListener() { // from class: com.immomo.mls.fun.ud.view.UDView.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float fAEQbTJ = C7865arr.AEQbTJ(motionEvent.getX());
                float fAEQbTJ2 = C7865arr.AEQbTJ(motionEvent.getY());
                if (UDView.this.ffGIBT != null) {
                    UDView.this.ffGIBT.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (UDView.this.zuWLRA != null) {
                        UDView.this.zuWLRA.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.DCUTEI, view, motionEvent);
                } else if (action == 1) {
                    if (UDView.this.QkdxfA != null) {
                        UDView.this.QkdxfA.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.RKDWNf, view, motionEvent);
                } else if (action == 2) {
                    if (UDView.this.QSBOWP != null) {
                        UDView.this.QSBOWP.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.gwTjWJ, view, motionEvent);
                } else if (action == 3) {
                    if (UDView.this.getPostValueLengthLimit != null) {
                        UDView.this.getPostValueLengthLimit.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.OBJEWx, view, motionEvent);
                }
                return UDView.this.QVAiDq == null;
            }

            public final void copydefault(LuaFunction luaFunction, View view, MotionEvent motionEvent) {
                if (luaFunction != null) {
                    if (UDView.this.DCJXGO == null) {
                        UDView.this.DCJXGO = new HashMap();
                    }
                    UDView.this.DCJXGO.clear();
                    UDView.this.DCJXGO.put("pageX", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getX())));
                    UDView.this.DCJXGO.put("pageY", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getY())));
                    UDView.this.DCJXGO.put("screenX", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getRawX())));
                    UDView.this.DCJXGO.put("screenY", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getRawY())));
                    UDView.this.DCJXGO.put(TypedValues.AttributesType.S_TARGET, view);
                    UDView.this.DCJXGO.put("timeStamp", Long.valueOf(System.currentTimeMillis()));
                    luaFunction.invoke(LuaValue.varargsOf(C7910asj.KWHzl(UDView.this.getGlobals(), UDView.this.DCJXGO)));
                }
            }
        };
        this.RcXXUw = new View.OnClickListener() { // from class: com.immomo.mls.fun.ud.view.UDView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UDView.QKVWgx && (view instanceof EditText)) {
                    TextView textView = (TextView) view;
                    ((ClipboardManager) UDView.this.AubY().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, textView.getHint()));
                    C57604ylZ.OLrzqt.OLrzqt("Copy key:" + ((Object) textView.getHint()), UDView.this.AubY().getDrawable(C52761wXj.TaskDescription.FYtjSf), 0, null, 0, 0);
                }
                if (!UDView.this.UeEOUB || UDView.this.uzCIH()) {
                    if (UDView.this.QVAiDq != null) {
                        UDView.this.QVAiDq.OLrzqt();
                    }
                    UDView uDView = UDView.this;
                    if (uDView.RJOkX) {
                        InputMethodManager inputMethodManager = (InputMethodManager) uDView.AubY().getSystemService("input_method");
                        View viewFindFocus = UDView.this.dHguZz.findFocus();
                        if (viewFindFocus == null || inputMethodManager == null) {
                            return;
                        }
                        inputMethodManager.hideSoftInputFromWindow(viewFindFocus.getWindowToken(), 2);
                    }
                }
            }
        };
        this.dxcTrN = new View.OnLongClickListener() { // from class: com.immomo.mls.fun.ud.view.UDView.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                boolean z = UDView.QKVWgx;
                if (z && (view instanceof EditText)) {
                    TextView textView = (TextView) view;
                    ((ClipboardManager) UDView.this.AubY().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, textView.getHint()));
                    C57604ylZ.OLrzqt.OLrzqt("Copy key:" + ((Object) textView.getHint()), UDView.this.AubY().getDrawable(C52761wXj.TaskDescription.FYtjSf), 0, null, 0, 0);
                } else if (z && (view instanceof TextView)) {
                    TextView textView2 = (TextView) view;
                    ((ClipboardManager) UDView.this.AubY().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, textView2.getText()));
                    C57604ylZ.OLrzqt.OLrzqt("Copy key:" + ((Object) textView2.getText()), UDView.this.AubY().getDrawable(C52761wXj.TaskDescription.FYtjSf), 0, null, 0, 0);
                }
                if (UDView.this.dvKsVJ == null) {
                    return false;
                }
                UDView.this.dvKsVJ.OLrzqt();
                return true;
            }
        };
        this.QUSxYX = new Object();
        ?? r1 = (V) AEQbTJ(luaValueArr);
        this.dHguZz = r1;
        r1.setTag(C7343ahz.TaskDescription.getNewProxyInstance, this);
        hDKMBd();
        QVAiDq();
        this.javaUserdata = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: V extends android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public UDView(Globals globals, @NonNull V v) {
        super(globals, v);
        this.QfsBiF = new HashMap();
        this.hBpjJd = new Activity();
        this.AxsJAYaxsJAY = -1.0f;
        this.iZzfmt = -1.0f;
        this.hUfVAv = -1.0f;
        this.gkJEwt = -1.0f;
        this.iRxXKY = -1.0f;
        this.dNCPSb = false;
        this.UeEOUB = true;
        this.finit = false;
        this.fvQaOB = false;
        this.AxsJAYsNCnLh = false;
        this.giSNqX = false;
        this.QbewEr = false;
        this.QHmsKR = new View.OnTouchListener() { // from class: com.immomo.mls.fun.ud.view.UDView.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float fAEQbTJ = C7865arr.AEQbTJ(motionEvent.getX());
                float fAEQbTJ2 = C7865arr.AEQbTJ(motionEvent.getY());
                if (UDView.this.ffGIBT != null) {
                    UDView.this.ffGIBT.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (UDView.this.zuWLRA != null) {
                        UDView.this.zuWLRA.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.DCUTEI, view, motionEvent);
                } else if (action == 1) {
                    if (UDView.this.QkdxfA != null) {
                        UDView.this.QkdxfA.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.RKDWNf, view, motionEvent);
                } else if (action == 2) {
                    if (UDView.this.QSBOWP != null) {
                        UDView.this.QSBOWP.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.gwTjWJ, view, motionEvent);
                } else if (action == 3) {
                    if (UDView.this.getPostValueLengthLimit != null) {
                        UDView.this.getPostValueLengthLimit.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.OBJEWx, view, motionEvent);
                }
                return UDView.this.QVAiDq == null;
            }

            public final void copydefault(LuaFunction luaFunction, View view, MotionEvent motionEvent) {
                if (luaFunction != null) {
                    if (UDView.this.DCJXGO == null) {
                        UDView.this.DCJXGO = new HashMap();
                    }
                    UDView.this.DCJXGO.clear();
                    UDView.this.DCJXGO.put("pageX", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getX())));
                    UDView.this.DCJXGO.put("pageY", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getY())));
                    UDView.this.DCJXGO.put("screenX", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getRawX())));
                    UDView.this.DCJXGO.put("screenY", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getRawY())));
                    UDView.this.DCJXGO.put(TypedValues.AttributesType.S_TARGET, view);
                    UDView.this.DCJXGO.put("timeStamp", Long.valueOf(System.currentTimeMillis()));
                    luaFunction.invoke(LuaValue.varargsOf(C7910asj.KWHzl(UDView.this.getGlobals(), UDView.this.DCJXGO)));
                }
            }
        };
        this.RcXXUw = new View.OnClickListener() { // from class: com.immomo.mls.fun.ud.view.UDView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UDView.QKVWgx && (view instanceof EditText)) {
                    TextView textView = (TextView) view;
                    ((ClipboardManager) UDView.this.AubY().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, textView.getHint()));
                    C57604ylZ.OLrzqt.OLrzqt("Copy key:" + ((Object) textView.getHint()), UDView.this.AubY().getDrawable(C52761wXj.TaskDescription.FYtjSf), 0, null, 0, 0);
                }
                if (!UDView.this.UeEOUB || UDView.this.uzCIH()) {
                    if (UDView.this.QVAiDq != null) {
                        UDView.this.QVAiDq.OLrzqt();
                    }
                    UDView uDView = UDView.this;
                    if (uDView.RJOkX) {
                        InputMethodManager inputMethodManager = (InputMethodManager) uDView.AubY().getSystemService("input_method");
                        View viewFindFocus = UDView.this.dHguZz.findFocus();
                        if (viewFindFocus == null || inputMethodManager == null) {
                            return;
                        }
                        inputMethodManager.hideSoftInputFromWindow(viewFindFocus.getWindowToken(), 2);
                    }
                }
            }
        };
        this.dxcTrN = new View.OnLongClickListener() { // from class: com.immomo.mls.fun.ud.view.UDView.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                boolean z = UDView.QKVWgx;
                if (z && (view instanceof EditText)) {
                    TextView textView = (TextView) view;
                    ((ClipboardManager) UDView.this.AubY().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, textView.getHint()));
                    C57604ylZ.OLrzqt.OLrzqt("Copy key:" + ((Object) textView.getHint()), UDView.this.AubY().getDrawable(C52761wXj.TaskDescription.FYtjSf), 0, null, 0, 0);
                } else if (z && (view instanceof TextView)) {
                    TextView textView2 = (TextView) view;
                    ((ClipboardManager) UDView.this.AubY().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, textView2.getText()));
                    C57604ylZ.OLrzqt.OLrzqt("Copy key:" + ((Object) textView2.getText()), UDView.this.AubY().getDrawable(C52761wXj.TaskDescription.FYtjSf), 0, null, 0, 0);
                }
                if (UDView.this.dvKsVJ == null) {
                    return false;
                }
                UDView.this.dvKsVJ.OLrzqt();
                return true;
            }
        };
        this.QUSxYX = new Object();
        this.dHguZz = v;
        hDKMBd();
        QVAiDq();
        this.javaUserdata = v;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [T, V extends android.view.View, android.view.View] */
    public UDView(Globals globals) {
        super(globals, (Object) null);
        this.QfsBiF = new HashMap();
        this.hBpjJd = new Activity();
        this.AxsJAYaxsJAY = -1.0f;
        this.iZzfmt = -1.0f;
        this.hUfVAv = -1.0f;
        this.gkJEwt = -1.0f;
        this.iRxXKY = -1.0f;
        this.dNCPSb = false;
        this.UeEOUB = true;
        this.finit = false;
        this.fvQaOB = false;
        this.AxsJAYsNCnLh = false;
        this.giSNqX = false;
        this.QbewEr = false;
        this.QHmsKR = new View.OnTouchListener() { // from class: com.immomo.mls.fun.ud.view.UDView.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float fAEQbTJ = C7865arr.AEQbTJ(motionEvent.getX());
                float fAEQbTJ2 = C7865arr.AEQbTJ(motionEvent.getY());
                if (UDView.this.ffGIBT != null) {
                    UDView.this.ffGIBT.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (UDView.this.zuWLRA != null) {
                        UDView.this.zuWLRA.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.DCUTEI, view, motionEvent);
                } else if (action == 1) {
                    if (UDView.this.QkdxfA != null) {
                        UDView.this.QkdxfA.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.RKDWNf, view, motionEvent);
                } else if (action == 2) {
                    if (UDView.this.QSBOWP != null) {
                        UDView.this.QSBOWP.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.gwTjWJ, view, motionEvent);
                } else if (action == 3) {
                    if (UDView.this.getPostValueLengthLimit != null) {
                        UDView.this.getPostValueLengthLimit.AEQbTJ(fAEQbTJ, fAEQbTJ2);
                    }
                    copydefault(UDView.this.OBJEWx, view, motionEvent);
                }
                return UDView.this.QVAiDq == null;
            }

            public final void copydefault(LuaFunction luaFunction, View view, MotionEvent motionEvent) {
                if (luaFunction != null) {
                    if (UDView.this.DCJXGO == null) {
                        UDView.this.DCJXGO = new HashMap();
                    }
                    UDView.this.DCJXGO.clear();
                    UDView.this.DCJXGO.put("pageX", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getX())));
                    UDView.this.DCJXGO.put("pageY", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getY())));
                    UDView.this.DCJXGO.put("screenX", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getRawX())));
                    UDView.this.DCJXGO.put("screenY", Float.valueOf(C7865arr.AEQbTJ(motionEvent.getRawY())));
                    UDView.this.DCJXGO.put(TypedValues.AttributesType.S_TARGET, view);
                    UDView.this.DCJXGO.put("timeStamp", Long.valueOf(System.currentTimeMillis()));
                    luaFunction.invoke(LuaValue.varargsOf(C7910asj.KWHzl(UDView.this.getGlobals(), UDView.this.DCJXGO)));
                }
            }
        };
        this.RcXXUw = new View.OnClickListener() { // from class: com.immomo.mls.fun.ud.view.UDView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UDView.QKVWgx && (view instanceof EditText)) {
                    TextView textView = (TextView) view;
                    ((ClipboardManager) UDView.this.AubY().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, textView.getHint()));
                    C57604ylZ.OLrzqt.OLrzqt("Copy key:" + ((Object) textView.getHint()), UDView.this.AubY().getDrawable(C52761wXj.TaskDescription.FYtjSf), 0, null, 0, 0);
                }
                if (!UDView.this.UeEOUB || UDView.this.uzCIH()) {
                    if (UDView.this.QVAiDq != null) {
                        UDView.this.QVAiDq.OLrzqt();
                    }
                    UDView uDView = UDView.this;
                    if (uDView.RJOkX) {
                        InputMethodManager inputMethodManager = (InputMethodManager) uDView.AubY().getSystemService("input_method");
                        View viewFindFocus = UDView.this.dHguZz.findFocus();
                        if (viewFindFocus == null || inputMethodManager == null) {
                            return;
                        }
                        inputMethodManager.hideSoftInputFromWindow(viewFindFocus.getWindowToken(), 2);
                    }
                }
            }
        };
        this.dxcTrN = new View.OnLongClickListener() { // from class: com.immomo.mls.fun.ud.view.UDView.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                boolean z = UDView.QKVWgx;
                if (z && (view instanceof EditText)) {
                    TextView textView = (TextView) view;
                    ((ClipboardManager) UDView.this.AubY().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, textView.getHint()));
                    C57604ylZ.OLrzqt.OLrzqt("Copy key:" + ((Object) textView.getHint()), UDView.this.AubY().getDrawable(C52761wXj.TaskDescription.FYtjSf), 0, null, 0, 0);
                } else if (z && (view instanceof TextView)) {
                    TextView textView2 = (TextView) view;
                    ((ClipboardManager) UDView.this.AubY().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, textView2.getText()));
                    C57604ylZ.OLrzqt.OLrzqt("Copy key:" + ((Object) textView2.getText()), UDView.this.AubY().getDrawable(C52761wXj.TaskDescription.FYtjSf), 0, null, 0, 0);
                }
                if (UDView.this.dvKsVJ == null) {
                    return false;
                }
                UDView.this.dvKsVJ.OLrzqt();
                return true;
            }
        };
        this.QUSxYX = new Object();
        ?? r2 = (V) AEQbTJ(LuaValue.empty());
        this.dHguZz = r2;
        hDKMBd();
        QVAiDq();
        this.javaUserdata = r2;
    }

    public boolean e_() {
        return C7330ahm.EZpvd;
    }

    public boolean d_() {
        return C7330ahm.copydefault;
    }

    public final void hDKMBd() {
        V v = this.dHguZz;
        if (v == null) {
            throw new NullPointerException("view is null!!!!");
        }
        boolean z = QKVWgx;
        if (z && (v instanceof EditText)) {
            v.setOnClickListener(this.RcXXUw);
        } else if (z && (v instanceof TextView)) {
            v.setOnLongClickListener(this.dxcTrN);
        }
        V v2 = this.dHguZz;
        if (v2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v2;
            if (viewGroup.getClipToPadding()) {
                viewGroup.setClipToPadding(e_());
            }
            if (viewGroup.getClipChildren()) {
                viewGroup.setClipChildren(d_());
            }
        }
    }

    public final void QVAiDq() {
        C7322ahe c7322ahe;
        if (!(this.dHguZz instanceof InterfaceC7408ajK) || (c7322ahe = (C7322ahe) this.globals.AuCTel()) == null) {
            return;
        }
        ((InterfaceC7408ajK) this.dHguZz).initCornerManager(c7322ahe.OLrzqt());
    }

    public C7322ahe zuBGHE() {
        return (C7322ahe) this.globals.AuCTel();
    }

    public Context AubY() {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    public boolean uzCIH() {
        C7322ahe c7322aheZuBGHE = zuBGHE();
        C7328ahk c7328ahk = c7322aheZuBGHE != null ? c7322aheZuBGHE.copydefault : null;
        if (c7328ahk != null) {
            return c7328ahk.valueOf().OLrzqt();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public void OLrzqt(int i, int i2) {
        UDViewGroup uDViewGroup = this.ODWQjV;
        if (uDViewGroup == null || this.OuxcSI == null) {
            return;
        }
        uDViewGroup.f_().measure(ViewGroup.getChildMeasureSpec(i, 0, f_().getMeasuredWidth()), ViewGroup.getChildMeasureSpec(i2, 0, f_().getMeasuredHeight()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public void OLrzqt(int i, int i2, int i3, int i4) {
        UDViewGroup uDViewGroup = this.ODWQjV;
        if (uDViewGroup == null || this.OuxcSI == null) {
            return;
        }
        uDViewGroup.f_().layout(0, 0, i3 - i, i4 - i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public void OLrzqt(Canvas canvas) {
        UDViewGroup uDViewGroup = this.ODWQjV;
        if (uDViewGroup == null || this.OuxcSI == null) {
            return;
        }
        uDViewGroup.f_().draw(canvas);
    }

    @InterfaceC60044zuT
    public LuaValue[] width(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            KWHzl(luaValueArr[0].toDouble());
            AhwBna(C7865arr.OLrzqt(C7865arr.copydefault(r0)));
            return null;
        }
        int iFetchVPNInfo = fetchVPNInfo();
        if (iFetchVPNInfo <= 0) {
            iFetchVPNInfo = C7842arU.OLrzqt(f_(), AubY());
        }
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(iFetchVPNInfo)));
    }

    public void KWHzl(double d) {
        if (d >= AudioStats.AUDIO_AMPLITUDE_NONE || d == -1.0d || d == -2.0d) {
            return;
        }
        C7833arL.valueOf("size must be set with positive number, error number: " + d + JwtUtilsKt.JWT_DELIMITER, getGlobals());
    }

    public void AhwBna(float f) {
        ViewGroup.LayoutParams layoutParams = this.dHguZz.getLayoutParams();
        if (layoutParams == null) {
            this.dHguZz.setLayoutParams(new ViewGroup.MarginLayoutParams((int) f, -2));
        } else {
            layoutParams.width = (int) f;
            this.dHguZz.setLayoutParams(layoutParams);
        }
    }

    public int fetchVPNInfo() {
        ViewGroup.LayoutParams layoutParams = this.dHguZz.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.width;
            return i >= 0 ? i : this.dHguZz.getWidth();
        }
        return this.dHguZz.getWidth();
    }

    @InterfaceC60044zuT
    public LuaValue[] height(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            KWHzl(luaValueArr[0].toDouble());
            AEQbTJ(C7865arr.OLrzqt(C7865arr.copydefault(r0)));
            return null;
        }
        int iDjBIcL = djBIcL();
        if (iDjBIcL <= 0) {
            iDjBIcL = C7842arU.copydefault(f_(), AubY());
        }
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(iDjBIcL)));
    }

    public void AEQbTJ(float f) {
        ViewGroup.LayoutParams layoutParams = this.dHguZz.getLayoutParams();
        if (layoutParams == null) {
            this.dHguZz.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, (int) f));
        } else {
            layoutParams.height = (int) f;
            this.dHguZz.setLayoutParams(layoutParams);
        }
    }

    public int djBIcL() {
        ViewGroup.LayoutParams layoutParams = this.dHguZz.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.height;
            return i >= 0 ? i : this.dHguZz.getHeight();
        }
        return this.dHguZz.getHeight();
    }

    @InterfaceC60044zuT
    public LuaValue[] anchorPoint(LuaValue[] luaValueArr) {
        float f = (float) luaValueArr[0].toDouble();
        float f2 = (float) luaValueArr[1].toDouble();
        int iFetchVPNInfo = fetchVPNInfo();
        int iDjBIcL = djBIcL();
        ViewGroup.LayoutParams layoutParams = this.dHguZz.getLayoutParams();
        if (layoutParams != null && (this.dHguZz.getParent() instanceof ViewGroup) && ((ViewGroup) this.dHguZz.getParent()).getLayoutParams() != null) {
            if (iFetchVPNInfo == 0 && layoutParams.width == -1) {
                iFetchVPNInfo = ((ViewGroup) this.dHguZz.getParent()).getLayoutParams().width;
            }
            if (iDjBIcL == 0 && layoutParams.height == -1) {
                iDjBIcL = ((ViewGroup) this.dHguZz.getParent()).getLayoutParams().height;
            }
        }
        if (f >= 0.0f && f <= 1.0f && iFetchVPNInfo != 0) {
            this.dHguZz.setPivotX(iFetchVPNInfo * f);
        }
        if (f2 < 0.0f || f2 > 1.0f || iDjBIcL == 0) {
            return null;
        }
        this.dHguZz.setPivotY(iDjBIcL * f2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] x(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            C7833arL.AEQbTJ("x", this.globals);
            fIwbmz(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
            return null;
        }
        C7833arL.copydefault("x", this.globals);
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(QOLQEE())));
    }

    public void fIwbmz(int i) {
        this.hBpjJd.valueOf = i;
        RcXXUw();
        this.dHguZz.setTranslationX(0.0f);
    }

    public float QOLQEE() {
        if (!Float.isNaN(this.hBpjJd.EZpvd)) {
            return this.hBpjJd.EZpvd - (fetchVPNInfo() >> 1);
        }
        return QKVWgx().leftMargin;
    }

    @InterfaceC60044zuT
    public LuaValue[] y(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            C7833arL.AEQbTJ(DateFormat.YEAR, this.globals);
            AuCTel(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
            return null;
        }
        C7833arL.copydefault(DateFormat.YEAR, this.globals);
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(DTwDnp())));
    }

    public void AuCTel(int i) {
        this.hBpjJd.gEmmrt = i;
        RcXXUw();
        this.dHguZz.setTranslationY(0.0f);
    }

    public float DTwDnp() {
        if (!Float.isNaN(this.hBpjJd.KWHzl)) {
            return this.hBpjJd.KWHzl - (djBIcL() >> 1);
        }
        return QKVWgx().topMargin;
    }

    @InterfaceC60044zuT
    public LuaValue[] bottom(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            C7833arL.AEQbTJ("bottom", this.globals);
            values(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
            return null;
        }
        C7833arL.copydefault("bottom", this.globals);
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(wlaJM())));
    }

    public void values(int i) {
        this.hBpjJd.gEmmrt = i - djBIcL();
        RcXXUw();
    }

    public float wlaJM() {
        int i = this.hBpjJd.copydefault;
        return i == 0 ? DTwDnp() + djBIcL() : i;
    }

    @InterfaceC60044zuT
    public LuaValue[] right(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            C7833arL.AEQbTJ(TtmlNode.RIGHT, this.globals);
            fJNWhG(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
            return null;
        }
        C7833arL.copydefault(TtmlNode.RIGHT, this.globals);
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(ORxRYg())));
    }

    public void fJNWhG(int i) {
        this.hBpjJd.valueOf = i - fetchVPNInfo();
        RcXXUw();
    }

    public float ORxRYg() {
        int i = this.hBpjJd.djBIcL;
        return i == 0 ? QOLQEE() + fetchVPNInfo() : i;
    }

    @InterfaceC60044zuT
    public LuaValue[] marginLeft(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(this.hBpjJd.DbNXlk)));
        }
        isConnected(C7865arr.copydefault(luaValueArr[0]));
        return null;
    }

    public void isConnected(int i) {
        this.hBpjJd.DbNXlk = i;
        djSkpj();
        this.dHguZz.setTranslationX(0.0f);
    }

    @InterfaceC60044zuT
    public LuaValue[] marginTop(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(this.hBpjJd.AkhnZx)));
        }
        AkhnZx(C7865arr.copydefault(luaValueArr[0]));
        return null;
    }

    public void AkhnZx(int i) {
        this.hBpjJd.AkhnZx = i;
        djSkpj();
        this.dHguZz.setTranslationY(0.0f);
    }

    @InterfaceC60044zuT
    public LuaValue[] marginRight(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(this.hBpjJd.isConnected)));
        }
        DbNXlk(C7865arr.copydefault(luaValueArr[0]));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] limitClick(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            this.UeEOUB = luaValueArr[0].toBoolean();
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rBoolean(this.UeEOUB));
    }

    @InterfaceC60044zuT
    public LuaValue[] setFocusableInTouchMode(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        f_().setFocusableInTouchMode(luaValueArr[0].toBoolean());
        return null;
    }

    public void DbNXlk(int i) {
        this.hBpjJd.isConnected = i;
        djSkpj();
    }

    @InterfaceC60044zuT
    public LuaValue[] marginBottom(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(this.hBpjJd.AYXKKw)));
        }
        this.hBpjJd.AYXKKw = C7865arr.copydefault(luaValueArr[0]);
        djSkpj();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] priority(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.valueOf(this.hBpjJd.AhwBna));
        }
        int i = luaValueArr[0].toInt();
        ViewParent parent = this.dHguZz.getParent();
        if (parent instanceof InterfaceC7777aqI) {
            ((InterfaceC7777aqI) parent).AEQbTJ(this.dHguZz, this.hBpjJd.AhwBna, i);
        }
        this.hBpjJd.AhwBna = i;
        djSkpj();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] weight(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            this.hBpjJd.fetchVPNInfo = luaValueArr[0].toInt();
            djSkpj();
            return null;
        }
        return LuaValue.rNumber(this.hBpjJd.fetchVPNInfo);
    }

    public final void djSkpj() {
        V v = this.dHguZz;
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (v.getParent() instanceof InterfaceC7384ain) {
            v.setLayoutParams(((InterfaceC7384ain) v.getParent()).applyLayoutParams(layoutParams, this.hBpjJd));
            return;
        }
        if (layoutParams == null) {
            layoutParams = QbewEr();
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        Activity activity = this.hBpjJd;
        C7460akJ.OLrzqt((ViewGroup.MarginLayoutParams) layoutParams, activity.DbNXlk, activity.AkhnZx, activity.isConnected, activity.AYXKKw);
        v.setLayoutParams(layoutParams);
    }

    public final boolean RcXXUw() {
        this.hBpjJd.values = false;
        V v = this.dHguZz;
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (v.getParent() instanceof InterfaceC7384ain) {
            v.setLayoutParams(((InterfaceC7384ain) v.getParent()).applyLayoutParams(layoutParams, this.hBpjJd));
            return true;
        }
        if (layoutParams == null) {
            layoutParams = QbewEr();
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        Activity activity = this.hBpjJd;
        C7460akJ.OLrzqt((ViewGroup.MarginLayoutParams) layoutParams, activity.valueOf, activity.gEmmrt, activity.djBIcL, activity.copydefault);
        v.setLayoutParams(layoutParams);
        return false;
    }

    public final ViewGroup.MarginLayoutParams QKVWgx() {
        ViewGroup.LayoutParams layoutParams = this.dHguZz.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = QbewEr();
            this.dHguZz.setLayoutParams(layoutParams);
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            this.dHguZz.setLayoutParams(marginLayoutParams);
            layoutParams = marginLayoutParams;
        }
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    @InterfaceC60044zuT
    public LuaValue[] frame(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            C7833arL.AEQbTJ(TypedValues.AttributesType.S_FRAME, this.globals);
            C7352aiH c7352aiHEZpvd = ((UDRect) luaValueArr[0]).EZpvd();
            C7348aiD c7348aiDCopydefault = c7352aiHEZpvd.copydefault();
            C7350aiF c7350aiFEZpvd = c7352aiHEZpvd.EZpvd();
            AhwBna(c7350aiFEZpvd.copydefault());
            AEQbTJ(c7350aiFEZpvd.AEQbTJ());
            fIwbmz((int) c7348aiDCopydefault.copydefault());
            AuCTel((int) c7348aiDCopydefault.OLrzqt());
            luaValueArr[0].destroy();
            return null;
        }
        C7833arL.copydefault(TypedValues.AttributesType.S_FRAME, this.globals);
        return LuaValue.varargsOf(new UDRect(this.globals, new C7352aiH(C7865arr.AEQbTJ(QOLQEE()), C7865arr.AEQbTJ(DTwDnp()), (int) C7865arr.AEQbTJ(fetchVPNInfo()), (int) C7865arr.AEQbTJ(djBIcL()))));
    }

    @InterfaceC60044zuT
    public LuaValue[] size(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            C7833arL.AEQbTJ("size", this.globals);
            C7350aiF c7350aiFAEQbTJ = ((UDSize) luaValueArr[0]).AEQbTJ();
            AhwBna(c7350aiFAEQbTJ.copydefault());
            AEQbTJ(c7350aiFAEQbTJ.AEQbTJ());
            luaValueArr[0].destroy();
            return null;
        }
        C7833arL.copydefault("size", this.globals);
        return LuaValue.varargsOf(new UDSize(this.globals, new C7350aiF((int) C7865arr.AEQbTJ(fetchVPNInfo()), (int) C7865arr.AEQbTJ(djBIcL()))));
    }

    @InterfaceC60044zuT
    public LuaValue[] point(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            C7833arL.AEQbTJ("point", this.globals);
            C7348aiD c7348aiDEZpvd = ((UDPoint) luaValueArr[0]).EZpvd();
            fIwbmz((int) c7348aiDEZpvd.copydefault());
            AuCTel((int) c7348aiDEZpvd.OLrzqt());
            luaValueArr[0].destroy();
            return null;
        }
        C7833arL.copydefault("point", this.globals);
        return LuaValue.varargsOf(new UDPoint(this.globals, new C7348aiD(C7865arr.AEQbTJ(QOLQEE()), C7865arr.AEQbTJ(DTwDnp()))));
    }

    @InterfaceC60044zuT
    public LuaValue[] centerX(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            C7833arL.AEQbTJ("centerX", this.globals);
            KWHzl(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
            return null;
        }
        C7833arL.copydefault("centerX", this.globals);
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(zLjUOn())));
    }

    public float zLjUOn() {
        if (!Float.isNaN(this.hBpjJd.EZpvd)) {
            return this.hBpjJd.EZpvd;
        }
        return f_().getX() + (fetchVPNInfo() / 2.0f);
    }

    public void KWHzl(float f) {
        Activity activity = this.hBpjJd;
        activity.djBIcL = 0;
        activity.valueOf = 0;
        activity.EZpvd = f;
        getNewProxyInstance();
    }

    @InterfaceC60044zuT
    public LuaValue[] centerY(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            C7833arL.AEQbTJ("centerY", this.globals);
            OLrzqt(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
            return null;
        }
        C7833arL.copydefault("centerY", this.globals);
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(AuCTelauCTel())));
    }

    public float AuCTelauCTel() {
        if (!Float.isNaN(this.hBpjJd.KWHzl)) {
            return this.hBpjJd.KWHzl;
        }
        return f_().getY() + (djBIcL() / 2.0f);
    }

    public void OLrzqt(float f) {
        Activity activity = this.hBpjJd;
        activity.copydefault = 0;
        activity.gEmmrt = 0;
        activity.KWHzl = f;
        getNewProxyInstance();
    }

    public final void getNewProxyInstance() {
        this.hBpjJd.values = false;
        V v = this.dHguZz;
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (v.getParent() instanceof InterfaceC7384ain) {
            v.setLayoutParams(((InterfaceC7384ain) v.getParent()).applyChildCenter(layoutParams, this.hBpjJd));
        }
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] getCenterX(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(zLjUOn())));
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] getCenterY(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(AuCTelauCTel())));
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] sizeToFit(LuaValue[] luaValueArr) {
        this.hBpjJd.values = false;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] removeFromSuper(LuaValue[] luaValueArr) {
        if (!(this.dHguZz.getParent() instanceof ViewGroup)) {
            return null;
        }
        C7823arB.EZpvd((ViewGroup) this.dHguZz.getParent(), this.dHguZz);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] superview(LuaValue[] luaValueArr) {
        if (this.dHguZz.getParent() instanceof InterfaceC7383aim) {
            return LuaValue.varargsOf(((InterfaceC7383aim) this.dHguZz.getParent()).getUserdata());
        }
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] layoutIfNeeded(LuaValue[] luaValueArr) {
        C7833arL.KWHzl("Method: layoutIfNeeded() is Deprecated");
        this.hBpjJd.values = false;
        this.dHguZz.requestLayout();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] padding(LuaValue[] luaValueArr) {
        this.DAIeex = C7865arr.copydefault((float) luaValueArr[3].toDouble());
        this.QKudOq = C7865arr.copydefault((float) luaValueArr[0].toDouble());
        this.RlQdEF = C7865arr.copydefault((float) luaValueArr[1].toDouble());
        this.accept = C7865arr.copydefault((float) luaValueArr[2].toDouble());
        UDViewGroup uDViewGroup = this.ODWQjV;
        if (uDViewGroup != null) {
            uDViewGroup.padding(luaValueArr);
        }
        this.dHguZz.setPaddingRelative(this.DAIeex, this.QKudOq, this.RlQdEF, this.accept);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setGravity(LuaValue[] luaValueArr) {
        this.hBpjJd.OLrzqt = luaValueArr[0].toInt();
        this.hBpjJd.AEQbTJ = true;
        djSkpj();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] requestLayout(LuaValue[] luaValueArr) {
        this.dHguZz.requestLayout();
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] setWrapContent(LuaValue[] luaValueArr) {
        if (!luaValueArr[0].toBoolean()) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = this.dHguZz.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        this.dHguZz.setLayoutParams(layoutParams);
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] setMatchParent(LuaValue[] luaValueArr) {
        if (!luaValueArr[0].toBoolean()) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = this.dHguZz.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        this.dHguZz.setLayoutParams(layoutParams);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] openRipple(LuaValue[] luaValueArr) {
        V v = this.dHguZz;
        if (!(v instanceof InterfaceC7407ajJ)) {
            return null;
        }
        ((InterfaceC7407ajJ) v).setDrawRipple(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] transform(LuaValue[] luaValueArr) {
        C7833arL.KWHzl("Method: transform() is Deprecated,  use rotation instead");
        float f = (float) luaValueArr[0].toDouble();
        boolean z = luaValueArr[1].toBoolean();
        gHZMYf();
        if (!z) {
            this.dHguZz.setRotation(f);
            return null;
        }
        V v = this.dHguZz;
        v.setRotation(v.getRotation() + f);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] transformIdentity(LuaValue[] luaValueArr) {
        gHZMYf();
        this.dHguZz.setRotation(this.iRxXKY);
        this.dHguZz.setScaleY(this.gkJEwt);
        this.dHguZz.setScaleX(this.hUfVAv);
        this.dHguZz.setTranslationX(this.AxsJAYaxsJAY);
        this.dHguZz.setTranslationY(this.iZzfmt);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] rotation(LuaValue[] luaValueArr) {
        boolean z = false;
        float f = (float) luaValueArr[0].toDouble();
        if (luaValueArr.length > 1 && luaValueArr[1].toBoolean()) {
            z = true;
        }
        gHZMYf();
        if (z) {
            this.dHguZz.setRotation(f);
            return null;
        }
        V v = this.dHguZz;
        v.setRotation(v.getRotation() + f);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] translation(LuaValue[] luaValueArr) {
        boolean z = false;
        float f = (float) luaValueArr[0].toDouble();
        float f2 = (float) luaValueArr[1].toDouble();
        if (luaValueArr.length > 2 && luaValueArr[2].toBoolean()) {
            z = true;
        }
        gHZMYf();
        V v = this.dHguZz;
        v.setTranslationX((z ? v.getTranslationX() : 0.0f) + C7865arr.copydefault(f));
        V v2 = this.dHguZz;
        v2.setTranslationY((z ? v2.getTranslationY() : 0.0f) + C7865arr.copydefault(f2));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] scale(LuaValue[] luaValueArr) {
        float fAbs = Math.abs((float) luaValueArr[0].toDouble());
        float fAbs2 = Math.abs((float) luaValueArr[1].toDouble());
        gHZMYf();
        this.dHguZz.setScaleX(fAbs);
        this.dHguZz.setScaleY(fAbs2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setMaxWidth(LuaValue[] luaValueArr) {
        V v = this.dHguZz;
        if (!(v instanceof InterfaceC7776aqH)) {
            return null;
        }
        ((InterfaceC7776aqH) v).setMaxWidth(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setMaxHeight(LuaValue[] luaValueArr) {
        V v = this.dHguZz;
        if (!(v instanceof InterfaceC7776aqH)) {
            return null;
        }
        ((InterfaceC7776aqH) v).setMaxHeight(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setMinWidth(LuaValue[] luaValueArr) {
        this.dHguZz.setMinimumWidth(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setMinHeight(LuaValue[] luaValueArr) {
        this.dHguZz.setMinimumHeight(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] bringSubviewToFront(LuaValue[] luaValueArr) {
        V v = this.dHguZz;
        if (!(v instanceof InterfaceC7384ain)) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof UDView)) {
            return null;
        }
        ((InterfaceC7384ain) v).bringSubviewToFront((UDView) luaValue);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] sendSubviewToBack(LuaValue[] luaValueArr) {
        V v = this.dHguZz;
        if (!(v instanceof InterfaceC7384ain)) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof UDView)) {
            return null;
        }
        ((InterfaceC7384ain) v).sendSubviewToBack((UDView) luaValue);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] canEndEditing(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0 || !luaValueArr[0].isBoolean()) {
            return null;
        }
        boolean z = luaValueArr[0].toBoolean();
        this.RJOkX = z;
        if (!z) {
            return null;
        }
        this.dHguZz.setOnClickListener(this.RcXXUw);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] alpha(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(this.dHguZz.getAlpha()));
        }
        this.dHguZz.setAlpha((float) luaValueArr[0].toDouble());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] borderWidth(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(getFieldNames())));
        }
        EZpvd(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] borderColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(new UDColor(getGlobals(), this.fZBcTu.getColor(this.globals)));
        }
        JColor jColorAEQbTJ = ((UDColor) luaValueArr[0]).AEQbTJ();
        this.fZBcTu = jColorAEQbTJ;
        fetchVPNInfo(jColorAEQbTJ.getColor(this.globals));
        luaValueArr[0].destroy();
        return null;
    }

    public final void aKErDB() {
        JColor jColor = this.fZBcTu;
        if (jColor != null) {
            fetchVPNInfo(jColor.getColor(this.globals));
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] hidden(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            if (luaValueArr[0].isBoolean()) {
                this.dHguZz.setVisibility(luaValueArr[0].toBoolean() ? 4 : 0);
                return null;
            }
        }
        return this.dHguZz.getVisibility() != 0 ? LuaValue.rTrue() : LuaValue.rFalse();
    }

    @InterfaceC60044zuT
    public LuaValue[] gone(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1 || !luaValueArr[0].isBoolean()) {
            return this.dHguZz.getVisibility() == 8 ? LuaValue.rTrue() : LuaValue.rFalse();
        }
        this.dHguZz.setVisibility(luaValueArr[0].toBoolean() ? 8 : 0);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] expandWidth(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        luaValueArr[0].isBoolean();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] subviewsCount(LuaValue[] luaValueArr) {
        if (f_() instanceof ViewGroup) {
            return LuaValue.varargsOf(LuaValue.rNumber(((ViewGroup) f_()).getChildCount()));
        }
        return LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    @InterfaceC60044zuT
    public LuaValue[] expandHeight(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        luaValueArr[0].isBoolean();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] bgColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1 || !AssertUtils.KWHzl(luaValueArr[0], UDColor.class, "bgColor", getGlobals())) {
            return LuaValue.varargsOf(new UDColor(getGlobals(), this.OcIXYQ.getColor(this.globals)));
        }
        this.QbewEr = false;
        UDColor uDColor = (UDColor) luaValueArr[0];
        this.OcIXYQ = uDColor.AEQbTJ();
        uDColor.destroy();
        valueOf(this.OcIXYQ.getColor(this.globals));
        luaValueArr[0].destroy();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setNineImage(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1 && luaValueArr[0].isString()) {
            this.dNCPSb = true;
            UDImageInfo uDImageInfo = (UDImageInfo) luaValueArr[0];
            OLrzqt(uDImageInfo.EZpvd());
            uDImageInfo.destroy();
            return null;
        }
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] cornerRadius(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(AYXKKw(1))));
        }
        copydefault(C7865arr.copydefault(luaValueArr[0]));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getCornerRadiusWithDirection(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(AYXKKw(luaValueArr.length == 1 ? luaValueArr[0].toInt() : 1))));
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] addShadow(LuaValue[] luaValueArr) {
        UDColor uDColor = (UDColor) luaValueArr[0];
        UDSize uDSize = (UDSize) luaValueArr[1];
        float fCopydefault = C7865arr.copydefault(luaValueArr[2].toFloat());
        float f = luaValueArr[3].toFloat();
        if (luaValueArr.length > 4) {
            luaValueArr[4].toBoolean();
        }
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph == null) {
            return null;
        }
        interfaceC7410ajMZsXlph.setAddShadow(uDColor.AEQbTJ().getColor(this.globals), uDSize.AEQbTJ(), fCopydefault, f);
        uDColor.destroy();
        C7833arL.copydefault("addShadow", "setShadow", getGlobals());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setShadow(LuaValue[] luaValueArr) {
        UDSize uDSize = (UDSize) luaValueArr[0];
        float fCopydefault = C7865arr.copydefault(luaValueArr[1].toFloat());
        float f = luaValueArr[2].toFloat();
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph == null) {
            return null;
        }
        interfaceC7410ajMZsXlph.setAddShadow(0, uDSize.AEQbTJ(), fCopydefault, f);
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] refresh(LuaValue[] luaValueArr) {
        C7833arL.KWHzl("Method: refresh() is Deprecated");
        this.dHguZz.invalidate();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setCornerRadiusWithDirection(LuaValue[] luaValueArr) {
        AEQbTJ(C7865arr.copydefault(luaValueArr[0]), luaValueArr.length == 2 ? luaValueArr[1].toInt() : 15);
        return null;
    }

    public void AEQbTJ(float f, int i) {
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph == null) {
            return;
        }
        float fFetchVPNInfo = fetchVPNInfo() <= djBIcL() ? fetchVPNInfo() : djBIcL();
        if (fFetchVPNInfo > 0.0f) {
            float f2 = fFetchVPNInfo / 2.0f;
            if (f > f2) {
                f = f2;
            }
        }
        interfaceC7410ajMZsXlph.setRadius(i, f);
    }

    @InterfaceC60044zuT
    public LuaValue[] addCornerMask(LuaValue[] luaValueArr) {
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph == null) {
            return null;
        }
        int i = luaValueArr.length == 3 ? luaValueArr[2].toInt() : 15;
        interfaceC7410ajMZsXlph.setRadiusColor(((UDColor) luaValueArr[1]).AEQbTJ().getColor(this.globals));
        luaValueArr[1].destroy();
        float fFetchVPNInfo = fetchVPNInfo() <= djBIcL() ? fetchVPNInfo() : djBIcL();
        float fCopydefault = luaValueArr[0].toFloat() <= 0.0f ? 0.0f : C7865arr.copydefault(luaValueArr[0]);
        if (fFetchVPNInfo > 0.0f) {
            float f = fFetchVPNInfo / 2.0f;
            if (fCopydefault > f) {
                fCopydefault = f;
            }
        }
        interfaceC7410ajMZsXlph.setMaskRadius(i, fCopydefault);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] clipToBounds(LuaValue[] luaValueArr) {
        boolean z = luaValueArr[0].toBoolean();
        ViewParent parent = this.dHguZz.getParent();
        V v = this.dHguZz;
        if (v instanceof ViewGroup) {
            ((ViewGroup) v).setClipToPadding(z);
            ((ViewGroup) this.dHguZz).setClipChildren(z);
        }
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setClipChildren(z);
        }
        V v2 = this.dHguZz;
        if (!(v2 instanceof InterfaceC7408ajK)) {
            return null;
        }
        ((InterfaceC7408ajK) v2).forceClipLevel(z ? 1 : 2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] clipToChildren(LuaValue[] luaValueArr) {
        boolean z = luaValueArr[0].toBoolean();
        V v = this.dHguZz;
        if (!(v instanceof ViewGroup)) {
            return null;
        }
        ((ViewGroup) v).setClipChildren(z);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] overlay(LuaValue[] luaValueArr) {
        this.OuxcSI = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (UDView) luaValueArr[0];
        if (this.ODWQjV == null) {
            this.ODWQjV = new UDViewGroup(this.globals) { // from class: com.immomo.mls.fun.ud.view.UDView.3
                /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
                @Override // com.immomo.mls.fun.ud.view.UDViewGroup, com.immomo.mls.fun.ud.view.UDView
                /* JADX INFO: renamed from: EZpvd */
                public ViewGroup AEQbTJ(LuaValue[] luaValueArr2) {
                    return new C7544alo(AubY(), this);
                }
            };
        }
        this.ODWQjV.padding(LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(this.QKudOq)), LuaNumber.copydefault(C7865arr.AEQbTJ(this.RlQdEF)), LuaNumber.copydefault(C7865arr.AEQbTJ(this.accept)), LuaNumber.copydefault(C7865arr.AEQbTJ(this.DAIeex))));
        UDView uDView = this.OuxcSI;
        if (uDView != null) {
            View viewF_ = uDView.f_();
            if (viewF_ instanceof TextView) {
                ((TextView) viewF_).setHorizontallyScrolling(false);
            }
        }
        this.ODWQjV.removeAllSubviews(null);
        this.ODWQjV.KWHzl(this.OuxcSI, -1);
        return null;
    }

    public InterfaceC7410ajM zsXlph() {
        V v = this.dHguZz;
        if (v instanceof InterfaceC7410ajM) {
            return (InterfaceC7410ajM) v;
        }
        return null;
    }

    public void EZpvd(float f) {
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph != null) {
            interfaceC7410ajMZsXlph.setStrokeWidth(f);
        }
    }

    public float getFieldNames() {
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph != null) {
            return interfaceC7410ajMZsXlph.getStrokeWidth();
        }
        return 0.0f;
    }

    public void fetchVPNInfo(int i) {
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph != null) {
            interfaceC7410ajMZsXlph.setStrokeColor(i);
        }
    }

    public void valueOf(int i) {
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph != null) {
            interfaceC7410ajMZsXlph.setBgColor(i);
        }
    }

    public void OLrzqt(JDImageInfo jDImageInfo) {
        InterfaceC7855arh interfaceC7855arhAYXKKw;
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph == null || TextUtils.isEmpty(jDImageInfo.getLocalUrl()) || (interfaceC7855arhAYXKKw = C7323ahf.AYXKKw()) == null) {
            return;
        }
        interfaceC7410ajMZsXlph.setBgDrawable(interfaceC7855arhAYXKKw.KWHzl(AubY(), jDImageInfo));
        f_().invalidate();
    }

    public int iwGUEr() {
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph != null) {
            return interfaceC7410ajMZsXlph.getBgColor();
        }
        return 0;
    }

    public void copydefault(float f) {
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph != null) {
            interfaceC7410ajMZsXlph.setCornerRadius(f);
        }
    }

    public float AYXKKw(int i) {
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph != null) {
            return interfaceC7410ajMZsXlph.getCornerRadiusWithDirection(i);
        }
        return 0.0f;
    }

    @InterfaceC60044zuT
    public LuaValue[] setGradientColorWithDirection(LuaValue[] luaValueArr) {
        this.AxsJAYsNCnLh = true;
        UDColor uDColor = (UDColor) luaValueArr[0];
        this.gGvvIC = uDColor.AEQbTJ();
        uDColor.destroy();
        UDColor uDColor2 = (UDColor) luaValueArr[1];
        this.gasjUx = uDColor2.AEQbTJ();
        uDColor2.destroy();
        this.flVtFt = luaValueArr[2].toInt();
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph == null) {
            return null;
        }
        interfaceC7410ajMZsXlph.setGradientColor(this.gGvvIC.getColor(this.globals), this.gasjUx.getColor(this.globals), this.flVtFt);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setGradientColor(LuaValue[] luaValueArr) {
        this.AxsJAYsNCnLh = false;
        UDColor uDColor = (UDColor) luaValueArr[0];
        this.gGvvIC = uDColor.AEQbTJ();
        UDColor uDColor2 = (UDColor) luaValueArr[1];
        this.gasjUx = uDColor2.AEQbTJ();
        uDColor.destroy();
        uDColor2.destroy();
        this.giSNqX = luaValueArr[2].toBoolean();
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph == null) {
            return null;
        }
        interfaceC7410ajMZsXlph.setGradientColor(this.gGvvIC.getColor(this.globals), this.gasjUx.getColor(this.globals), this.giSNqX ? 3 : 1);
        return null;
    }

    public void UeEOUB() {
        JColor jColor;
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (this.AxsJAYsNCnLh && (jColor = this.gGvvIC) != null && this.gasjUx != null) {
            if (interfaceC7410ajMZsXlph != null) {
                interfaceC7410ajMZsXlph.setGradientColor(jColor.getColor(this.globals), this.gasjUx.getColor(this.globals), this.flVtFt);
            }
        } else {
            JColor jColor2 = this.gGvvIC;
            if (jColor2 == null || this.gasjUx == null || interfaceC7410ajMZsXlph == null) {
                return;
            }
            interfaceC7410ajMZsXlph.setGradientColor(jColor2.getColor(this.globals), this.gasjUx.getColor(this.globals), this.giSNqX ? 3 : 1);
        }
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] notClip(LuaValue[] luaValueArr) {
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph == null) {
            return null;
        }
        interfaceC7410ajMZsXlph.setDrawRadiusBackground(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] enabled(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1 || !luaValueArr[0].isBoolean()) {
            return this.dHguZz.isEnabled() ? LuaValue.rTrue() : LuaValue.rFalse();
        }
        this.dHguZz.setEnabled(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] onTouch(LuaValue[] luaValueArr) {
        C7833arL.KWHzl("Method: onTouch() is Deprecated");
        LuaFunction luaFunction = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        this.ffGIBT = luaFunction;
        djBIcL(luaFunction);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] onClick(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.QVAiDq;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        this.QVAiDq = luaFunction2;
        if (luaFunction2 != null) {
            this.dHguZz.setOnClickListener(this.RcXXUw);
        }
        return null;
    }

    public LuaFunction AYXKKw(String str) {
        return this.QfsBiF.get(str);
    }

    public void OLrzqt(LuaValue[] luaValueArr, String str, TaskDescription taskDescription) {
        KWHzl(luaValueArr, 0, str, taskDescription);
    }

    public void KWHzl(LuaValue[] luaValueArr, int i, String str, TaskDescription taskDescription) {
        if (i < luaValueArr.length) {
            LuaFunction luaFunctionRemove = this.QfsBiF.remove(str);
            if (luaFunctionRemove != null) {
                luaFunctionRemove.destroy();
            }
            LuaFunction luaFunction = luaValueArr[i].isFunction() ? luaValueArr[i].toLuaFunction() : null;
            if (luaFunction != null) {
                this.QfsBiF.put(str, luaFunction);
            }
            taskDescription.OLrzqt(luaFunction);
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] onLongPress(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        this.dvKsVJ = luaFunction;
        if (luaFunction != null) {
            this.dHguZz.setOnLongClickListener(this.dxcTrN);
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] hasFocus(LuaValue[] luaValueArr) {
        return this.dHguZz.isFocused() ? LuaValue.rTrue() : LuaValue.rFalse();
    }

    @InterfaceC60044zuT
    public LuaValue[] canFocus(LuaValue[] luaValueArr) {
        return this.dHguZz.isFocusable() ? LuaValue.rTrue() : LuaValue.rFalse();
    }

    @InterfaceC60044zuT
    public LuaValue[] requestFocus(LuaValue[] luaValueArr) {
        this.dHguZz.requestFocus();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] cancelFocus(LuaValue[] luaValueArr) {
        this.dHguZz.clearFocus();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] startAnimation(LuaValue[] luaValueArr) {
        final UDBaseAnimation uDBaseAnimation = (UDBaseAnimation) luaValueArr[0].toUserdata().getJavaUserdata();
        int iAhwBna = uDBaseAnimation.AhwBna();
        if (iAhwBna > 0) {
            final View viewF_ = f_();
            viewF_.postDelayed(new Runnable() { // from class: com.immomo.mls.fun.ud.view.UDView.1
                @Override // java.lang.Runnable
                public void run() {
                    viewF_.startAnimation(uDBaseAnimation.OLrzqt());
                }
            }, iAhwBna);
        }
        f_().startAnimation(uDBaseAnimation.OLrzqt());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] clearAnimation(LuaValue[] luaValueArr) {
        f_().clearAnimation();
        return null;
    }

    public final void QUSxYX() {
        if (this.QbewEr && !TextUtils.isEmpty(this.DarRvM.getLocalUrl())) {
            KWHzl(this.DarRvM);
            return;
        }
        JColor jColor = this.OcIXYQ;
        if (jColor != null) {
            valueOf(jColor.getColor(this.globals));
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] bgImage(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            this.QbewEr = true;
            UDImageInfo uDImageInfo = (UDImageInfo) luaValueArr[0];
            this.DarRvM = uDImageInfo.EZpvd();
            uDImageInfo.destroy();
            InterfaceC7855arh interfaceC7855arhAYXKKw = C7323ahf.AYXKKw();
            Drawable drawableKWHzl = interfaceC7855arhAYXKKw.KWHzl(AubY(), this.DarRvM);
            if (drawableKWHzl != null) {
                f_().setBackground(drawableKWHzl);
                return null;
            }
            String str = zuBGHE().EZpvd;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str, this.DarRvM.getLocalUrl());
                if (file.exists()) {
                    interfaceC7855arhAYXKKw.KWHzl(AubY(), file.getAbsolutePath(), this.DarRvM.isAutoMirrored(), null, QfsBiF());
                }
            }
        }
        return null;
    }

    public void KWHzl(JDImageInfo jDImageInfo) {
        this.QbewEr = true;
        InterfaceC7855arh interfaceC7855arhAYXKKw = C7323ahf.AYXKKw();
        Drawable drawableKWHzl = interfaceC7855arhAYXKKw.KWHzl(AubY(), jDImageInfo);
        if (drawableKWHzl != null) {
            f_().setBackground(drawableKWHzl);
        }
        String str = zuBGHE().EZpvd;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str, jDImageInfo.getLocalUrl());
        if (file.exists()) {
            interfaceC7855arhAYXKKw.KWHzl(AubY(), file.getAbsolutePath(), jDImageInfo.isAutoMirrored(), null, QfsBiF());
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setPositionAdjustForKeyboard(LuaValue[] luaValueArr) {
        EZpvd(UDView.class.getSimpleName(), "setPositionAdjustForKeyboard()");
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setPositionAdjustForKeyboardAndOffset(LuaValue[] luaValueArr) {
        EZpvd(UDView.class.getSimpleName(), "setPositionAdjustForKeyboardAndOffset()");
        return null;
    }

    public void EZpvd(String str, String str2) {
        if (C7326ahi.EZpvd) {
            String str3 = "Deprecated Method = " + str + "  " + str2;
            if (zuBGHE().KWHzl != null) {
                zuBGHE().KWHzl.print(str3);
                zuBGHE().KWHzl.println();
            }
            C7323ahf.fIwbmz().copydefault(str3);
        }
    }

    public ViewGroup.MarginLayoutParams QbewEr() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @InterfaceC60044zuT
    public LuaValue[] convertRelativePointTo(LuaValue[] luaValueArr) {
        return convertPointTo(luaValueArr);
    }

    @InterfaceC60044zuT
    public LuaValue[] convertPointTo(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 2) {
            return null;
        }
        UDView uDView = AssertUtils.KWHzl(luaValueArr[0], UDView.class, "convertPointTo", getGlobals()) ? (UDView) luaValueArr[0] : null;
        C7348aiD c7348aiDEZpvd = AssertUtils.KWHzl(luaValueArr[1], UDPoint.class, "convertPointTo", getGlobals()) ? ((UDPoint) luaValueArr[1]).EZpvd() : null;
        luaValueArr[1].destroy();
        if (uDView == null || c7348aiDEZpvd == null) {
            return null;
        }
        this.dHguZz.getLocationInWindow(new int[2]);
        uDView.dHguZz.getLocationInWindow(new int[2]);
        C7348aiD c7348aiD = new C7348aiD();
        c7348aiD.KWHzl((C7865arr.AEQbTJ(r10[0]) + c7348aiDEZpvd.KWHzl()) - C7865arr.AEQbTJ(r1[0]));
        c7348aiD.AEQbTJ((C7865arr.AEQbTJ(r10[1]) + c7348aiDEZpvd.EZpvd()) - C7865arr.AEQbTJ(r1[1]));
        return LuaValue.varargsOf(new UDPoint(getGlobals(), c7348aiD));
    }

    @InterfaceC60044zuT
    public LuaValue[] removeAllAnimation(LuaValue[] luaValueArr) {
        dNCPSb();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] convertPointFrom(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 2) {
            return null;
        }
        UDView uDView = AssertUtils.KWHzl(luaValueArr[0], UDView.class, "convertPointFrom", getGlobals()) ? (UDView) luaValueArr[0] : null;
        C7348aiD c7348aiDEZpvd = ((UDPoint) luaValueArr[1]).EZpvd();
        luaValueArr[1].destroy();
        if (uDView == null || c7348aiDEZpvd == null) {
            return null;
        }
        uDView.dHguZz.getLocationInWindow(new int[2]);
        this.dHguZz.getLocationInWindow(new int[2]);
        C7348aiD c7348aiD = new C7348aiD();
        c7348aiD.KWHzl((C7865arr.AEQbTJ(r8[0]) + c7348aiDEZpvd.KWHzl()) - C7865arr.AEQbTJ(r1[0]));
        c7348aiD.AEQbTJ((C7865arr.AEQbTJ(r8[1]) + c7348aiDEZpvd.EZpvd()) - C7865arr.AEQbTJ(r1[1]));
        return LuaValue.varargsOf(new UDPoint(getGlobals(), c7348aiD));
    }

    @InterfaceC60044zuT
    public LuaValue[] locationInWindow(LuaValue[] luaValueArr) {
        this.dHguZz.getLocationInWindow(new int[2]);
        C7348aiD c7348aiD = new C7348aiD();
        c7348aiD.KWHzl(C7865arr.AEQbTJ(r5[0]));
        c7348aiD.AEQbTJ(C7865arr.AEQbTJ(r5[1]));
        return LuaValue.varargsOf(new UDPoint(getGlobals(), c7348aiD));
    }

    @InterfaceC60044zuT
    public LuaValue[] locationOnScreen(LuaValue[] luaValueArr) {
        this.dHguZz.getLocationOnScreen(new int[2]);
        C7348aiD c7348aiD = new C7348aiD();
        c7348aiD.KWHzl(C7865arr.AEQbTJ(r5[0]));
        c7348aiD.AEQbTJ(C7865arr.AEQbTJ(r5[1]));
        return LuaValue.varargsOf(new UDPoint(getGlobals(), c7348aiD));
    }

    public void dNCPSb() {
        if (this.DTwDnp != null) {
            ArrayList arrayList = new ArrayList(this.DTwDnp);
            this.DTwDnp.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).cancel();
            }
        }
    }

    public void AEQbTJ() {
        LuaFunction luaFunction = this.djSkpj;
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        LuaFunction luaFunction2 = this.OqFWZa;
        if (luaFunction2 != null) {
            luaFunction2.OLrzqt();
        }
        dNCPSb();
        SubHelper.AEQbTJ(this.QUSxYX);
    }

    @InterfaceC60044zuT
    public LuaValue[] onDetachedView(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.djSkpj;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.djSkpj = luaValueArr[0].toLuaFunction();
        return null;
    }

    public final void RJOkX() {
        RxBus.AEQbTJ("day_night_change").subscribe(new RxBus.EventCallback<String>(this.QUSxYX) { // from class: com.immomo.mls.fun.ud.view.UDView.6
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                if (UDView.this.fFgQHt != null) {
                    UDView.this.fFgQHt.EZpvd();
                }
                UDView.this.QUSxYX();
                UDView.this.UeEOUB();
                UDView.this.aKErDB();
            }
        });
    }

    public void copydefault() {
        RJOkX();
    }

    @InterfaceC60044zuT
    public LuaValue[] touchBegin(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.zuWLRA;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.zuWLRA = luaFunction2;
        djBIcL(luaFunction2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] touchMove(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.QSBOWP;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.QSBOWP = luaFunction2;
        djBIcL(luaFunction2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] touchEnd(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.QkdxfA;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.QkdxfA = luaFunction2;
        djBIcL(luaFunction2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] touchCancel(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.getPostValueLengthLimit;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.getPostValueLengthLimit = luaFunction2;
        djBIcL(luaFunction2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] touchBeginExtension(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.DCUTEI;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.DCUTEI = luaFunction2;
        djBIcL(luaFunction2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] touchMoveExtension(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.gwTjWJ;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.gwTjWJ = luaFunction2;
        djBIcL(luaFunction2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] touchEndExtension(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.RKDWNf;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.RKDWNf = luaFunction2;
        djBIcL(luaFunction2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] touchCancelExtension(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.OBJEWx;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.OBJEWx = luaFunction2;
        djBIcL(luaFunction2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] snapshot(LuaValue[] luaValueArr) {
        String strEZpvd = EZpvd(luaValueArr[0].toJavaString());
        return strEZpvd != null ? LuaValue.rString(strEZpvd) : LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] onDraw(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.DXXBbs;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.DXXBbs = (luaValueArr.length <= 0 || !luaValueArr[0].isFunction()) ? null : luaValueArr[0].toLuaFunction();
        return null;
    }

    public void KWHzl(Canvas canvas) {
        if (this.DXXBbs != null) {
            if (this.RdAHlO == null) {
                UDCanvas uDCanvas = new UDCanvas(getGlobals(), canvas);
                this.RdAHlO = uDCanvas;
                uDCanvas.onJavaRef();
            }
            this.RdAHlO.OLrzqt(canvas);
            int iSave = canvas.save();
            this.DXXBbs.invoke(LuaValue.varargsOf(this.RdAHlO));
            canvas.restoreToCount(iSave);
        }
    }

    public final void djBIcL(LuaFunction luaFunction) {
        if (luaFunction != null) {
            this.dHguZz.setOnTouchListener(this.QHmsKR);
        }
    }

    public final String EZpvd(String str) {
        this.dHguZz.setDrawingCacheEnabled(true);
        this.dHguZz.buildDrawingCache();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.dHguZz.getWidth(), this.dHguZz.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, bitmapCreateBitmap.getHeight(), new Paint());
        this.dHguZz.draw(canvas);
        try {
            return EZpvd(bitmapCreateBitmap, str);
        } catch (IOException e) {
            C7870arw.AEQbTJ(e, new Object[0]);
            return null;
        }
    }

    public final String EZpvd(Bitmap bitmap, String str) throws IOException {
        File fileEZpvd = C7864arq.EZpvd();
        if (!fileEZpvd.exists()) {
            fileEZpvd.mkdir();
        }
        File file = new File(C7864arq.EZpvd(), str);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file.getPath();
    }

    public final void gHZMYf() {
        if (this.AxsJAYaxsJAY == -1.0f) {
            this.AxsJAYaxsJAY = this.dHguZz.getTranslationX();
        }
        if (this.iZzfmt == -1.0f) {
            this.iZzfmt = this.dHguZz.getTranslationY();
        }
        if (this.hUfVAv == -1.0f) {
            this.hUfVAv = this.dHguZz.getScaleX();
        }
        if (this.gkJEwt == -1.0f) {
            this.gkJEwt = this.dHguZz.getScaleY();
        }
        if (this.iRxXKY == -1.0f) {
            this.iRxXKY = this.dHguZz.getRotation();
        }
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public String toString() {
        return this.dHguZz.getClass().getSimpleName() + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + this.dHguZz.hashCode();
    }

    public final InterfaceC7852are QfsBiF() {
        InterfaceC7852are interfaceC7852are = this.aKErDB;
        if (interfaceC7852are != null) {
            return interfaceC7852are;
        }
        InterfaceC7852are interfaceC7852are2 = new InterfaceC7852are() { // from class: com.immomo.mls.fun.ud.view.UDView.8
            @Override // o.InterfaceC7852are
            public void copydefault(Drawable drawable, String str) {
                if (drawable != null) {
                    UDView.this.f_().setBackground(drawable);
                }
            }
        };
        this.aKErDB = interfaceC7852are2;
        return interfaceC7852are2;
    }

    @InterfaceC60044zuT
    public LuaValue[] fitSysWindow(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0) {
            return null;
        }
        f_().setFitsSystemWindows(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] onRootViewDealloc(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0) {
            return null;
        }
        LuaFunction luaFunction = this.OqFWZa;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.OqFWZa = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTag(LuaValue[] luaValueArr) {
        String javaString = (luaValueArr.length == 1 && !luaValueArr[0].isNil() && luaValueArr[0].isString()) ? luaValueArr[0].toJavaString() : null;
        if (javaString != null) {
            f_().setTag(javaString);
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] forbiddenFlipInRTL(@Nullable LuaValue[] luaValueArr) {
        this.finit = true;
        if (!this.fvQaOB && C55296xhK.OLrzqt(AubY())) {
            EZpvd(f_(), true);
            V v = this.dHguZz;
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    Object tag = viewGroup.getChildAt(i).getTag(C7343ahz.TaskDescription.getNewProxyInstance);
                    if (tag instanceof UDView) {
                        ((UDView) tag).forbiddenFlipInRTL(null);
                    }
                }
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] ignoreForbiddenFlipInRTL(@Nullable LuaValue[] luaValueArr) {
        this.fvQaOB = true;
        if (C55296xhK.OLrzqt(AubY())) {
            EZpvd(f_(), false);
            V v = this.dHguZz;
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    Object tag = viewGroup.getChildAt(i).getTag(C7343ahz.TaskDescription.getNewProxyInstance);
                    if (tag instanceof UDView) {
                        ((UDView) tag).ignoreForbiddenFlipInRTL(null);
                    }
                }
            }
        }
        return null;
    }

    public final void EZpvd(@NonNull View view, boolean z) {
        view.setLayoutDirection(!z ? 1 : 0);
        view.setTextDirection(z ? 3 : 4);
    }

    public int[] valueOf(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            return null;
        }
        ArrayList<UDColor> arrayListKWHzl = KWHzl(luaValueArr[0].toLuaTable());
        int[] iArr = new int[arrayListKWHzl.size()];
        for (int i = 0; i < arrayListKWHzl.size(); i++) {
            iArr[i] = arrayListKWHzl.get(i).AEQbTJ().getColor(this.globals);
        }
        return iArr;
    }

    public ArrayList<UDColor> KWHzl(@NonNull LuaTable luaTable) {
        ArrayList<UDColor> arrayList = new ArrayList<>();
        if (!luaTable.gHZMYf()) {
            return arrayList;
        }
        while (true) {
            LuaValue[] luaValueArrSSMYrx = luaTable.sSMYrx();
            if (luaValueArrSSMYrx != null) {
                LuaValue luaValue = luaValueArrSSMYrx[1];
                if (luaValue instanceof UDColor) {
                    arrayList.add((UDColor) luaValue);
                }
            } else {
                luaTable.zsXlph();
                luaTable.destroy();
                return arrayList;
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setClipChildren(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1 && !luaValueArr[0].isNil()) {
            if (!luaValueArr[0].isBoolean()) {
                return null;
            }
            boolean z = luaValueArr[0].toBoolean();
            if (!(f_() instanceof ViewGroup)) {
                return null;
            }
            ((ViewGroup) f_()).setClipChildren(z);
            return null;
        }
        if (f_() instanceof ViewGroup) {
            return LuaValue.rBoolean(((ViewGroup) f_()).getClipChildren());
        }
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] accessibilityId(LuaValue[] luaValueArr) {
        String javaString;
        if (luaValueArr.length == 1 && !luaValueArr[0].isNil()) {
            if (!luaValueArr[0].isString() || (javaString = luaValueArr[0].toJavaString()) == null) {
                return null;
            }
            f_().setContentDescription(javaString);
            return null;
        }
        CharSequence contentDescription = f_().getContentDescription();
        if (!C6798aWF.AEQbTJ(contentDescription)) {
            return LuaValue.rString(contentDescription.toString());
        }
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] showSyncSkeleton(LuaValue[] luaValueArr) {
        C55420xjc.OLrzqt(f_());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] hideSyncSkeleton(LuaValue[] luaValueArr) {
        C55420xjc.copydefault(f_());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] asSkeleton(LuaValue[] luaValueArr) {
        C55360xiV c55360xiV;
        if (luaValueArr.length >= 3) {
            c55360xiV = new C55360xiV(Integer.valueOf(luaValueArr[2].toInt()), Integer.valueOf(luaValueArr[1].toInt()), false, Float.valueOf(luaValueArr[0].toFloat()));
        } else {
            c55360xiV = null;
        }
        C55420xjc.AEQbTJ(f_(), c55360xiV);
        return null;
    }
}
