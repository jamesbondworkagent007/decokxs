package com.immomo.mls.fun.ud.view;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.immomo.mls.fun.constants.TextAlign;
import com.immomo.mls.fun.ud.UDColor;
import java.lang.Character;
import java.util.Locale;
import o.C38303pTu;
import o.C55001xbh;
import o.C7326ahi;
import o.C7537alh;
import o.C7833arL;
import o.C7870arw;
import o.InterfaceC60044zuT;
import o.pUU;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDEditText<L extends C7537alh> extends UDLabel<L> implements TextWatcher, TextView.OnEditorActionListener {
    public static final String[] KWHzl = {"placeholder", "placeholderColor", "inputMode", "singleLine", "passwordMode", "maxLength", "maxBytes", "returnMode", "setBeginChangingCallback", "setDidChangingCallback", "setDidChangingCallbackNew", "setEndChangedCallback", "setReturnCallback", "setCursorColor", "setCanEdit", "showKeyboard", "dismissKeyboard", "setShouldChangeCallback", "setKeyboardDistance", "setKeyboardHandlerDisabled", "setFormatter", "shouldGroup", "text", "setOnBackspaceDownListener", "getCursorPosition", "setCursorPosition", "forbiddenReturnText", "setFocusChangeCallback"};
    public static final String copydefault = UDEditText.class.getSimpleName();
    public LuaFunction AEQbTJ;
    public boolean AYXKKw;
    public LuaFunction AhwBna;
    public LuaFunction AkhnZx;
    public LuaFunction AuCTel;
    public LuaFunction DbNXlk;
    public LuaFunction EZpvd;
    public LuaFunction OLrzqt;
    public int djBIcL;
    public boolean ejfBZ;
    public int fARcdN;
    public boolean fIwbmz;
    public int fJNWhG;
    public int fetchVPNInfo;
    public boolean gEmmrt;
    public boolean getNewProxyInstance;
    public LuaFunction isConnected;
    public UDEditTextFormatter uzCIH;
    public boolean valueOf;
    public int values;

    public static boolean EZpvd(int i) {
        return (i >= 9728 && i <= 10175) || i == 12349 || i == 8265 || i == 8252 || (i >= 8192 && i <= 8207) || ((i >= 8232 && i <= 8239) || i == 8287 || ((i >= 8293 && i <= 8303) || ((i >= 8448 && i <= 8527) || ((i >= 8960 && i <= 9215) || ((i >= 11008 && i <= 11263) || ((i >= 10496 && i <= 10623) || ((i >= 12800 && i <= 13055) || ((i >= 55296 && i <= 57343) || ((i >= 57344 && i <= 63743) || ((i >= 65024 && i <= 65039) || i >= 65536))))))))));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @InterfaceC60044zuT
    public UDEditText(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.ejfBZ = false;
        this.fIwbmz = false;
        this.djBIcL = 1;
        this.getNewProxyInstance = false;
        this.gEmmrt = false;
        this.valueOf = false;
        this.fJNWhG = 0;
        this.fARcdN = 0;
        this.AYXKKw = false;
        this.values = TextAlign.LEFT;
        this.fetchVPNInfo = 0;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl([Lorg/luaj/vm2/LuaValue;)Landroid/widget/TextView; */
    @Override // com.immomo.mls.fun.ud.view.UDLabel
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public L AEQbTJ(LuaValue[] luaValueArr) {
        return (L) new C7537alh(AubY(), this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.immomo.mls.fun.ud.view.UDLabel
    public void AEQbTJ(String str) {
        try {
            super.AEQbTJ(str);
            ((C7537alh) f_()).setSelection(str.length());
        } catch (Exception e) {
            if (C7326ahi.EZpvd) {
                pUU.copydefault("mln", Log.getStackTraceString(e));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] placeholder(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length >= 1) {
            String javaString = luaValueArr[0].toJavaString();
            if (luaValueArr[0].isNil()) {
                javaString = "";
            }
            if (this.fIwbmz) {
                javaString = javaString.replace("\n", "");
            }
            ((C7537alh) f_()).setHint(javaString);
            return null;
        }
        return LuaValue.varargsOf(LuaString.copydefault(((C7537alh) f_()).getHint().toString()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] placeholderColor(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length >= 1) {
            ((C7537alh) f_()).setHintTextColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
            luaValueArr[0].destroy();
            return null;
        }
        return LuaValue.varargsOf(new UDColor(getGlobals(), ((C7537alh) f_()).getHintTextColors().getDefaultColor()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] inputMode(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            return LuaValue.varargsOf(LuaNumber.valueOf(this.djBIcL));
        }
        if (luaValueArr[0].isNil()) {
            return null;
        }
        int i = luaValueArr[0].toInt();
        this.djBIcL = i;
        if (this.ejfBZ) {
            i |= 128;
        }
        if (i == 2 || i == 8194) {
            ((C7537alh) f_()).setInputType(i);
            this.fIwbmz = false;
            singleLine(LuaValue.rBoolean(true));
        } else if (!this.fIwbmz) {
            ((C7537alh) f_()).setInputType(i | 131072);
        } else {
            ((C7537alh) f_()).setInputType(i & (-131073));
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r3v19, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r3v21, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r3v24, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] singleLine(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length >= 1) {
            boolean z = luaValueArr[0].toBoolean();
            if (this.fIwbmz != z) {
                this.fIwbmz = z;
                ((C7537alh) f_()).setSingleLine(z);
                if (z) {
                    ((C7537alh) f_()).setGravity(this.values | 16);
                    if (((C7537alh) f_()).getHint() != null) {
                        placeholder(LuaValue.varargsOf(LuaString.copydefault(((C7537alh) f_()).getHint().toString())));
                    }
                } else {
                    ((C7537alh) f_()).setGravity(this.values | 48);
                }
                OLrzqt(this.ejfBZ);
            }
            Editable text = ((C7537alh) f_()).getText();
            if (text == null || TextUtils.isEmpty(text.toString()) || !this.fIwbmz) {
                return null;
            }
            AEQbTJ(text.toString().replace("\n", " "));
            return null;
        }
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(this.fIwbmz));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.immomo.mls.fun.ud.view.UDLabel
    @InterfaceC60044zuT
    public LuaValue[] textAlign(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.valueOf(((C7537alh) f_()).getGravity()));
        }
        this.values = luaValueArr[0].toInt();
        ((C7537alh) f_()).setGravity((this.fIwbmz ? 16 : 48) | this.values);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] passwordMode(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length >= 1) {
            int selectionStart = ((C7537alh) f_()).getSelectionStart();
            boolean z = luaValueArr[0].toBoolean();
            this.ejfBZ = z;
            OLrzqt(z);
            KWHzl(selectionStart);
            return null;
        }
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(this.ejfBZ));
    }

    @InterfaceC60044zuT
    public LuaValue[] maxLength(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            return LuaValue.varargsOf(LuaNumber.valueOf(this.fJNWhG));
        }
        int i = luaValueArr[0].toInt();
        this.fJNWhG = i;
        copydefault(i);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean copydefault(int i) {
        InputFilter[] filters = ((C7537alh) f_()).getFilters();
        int length = filters.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (filters[i2] instanceof InputFilter.LengthFilter) {
                filters[i2] = new InputFilter.LengthFilter(i);
                ((C7537alh) f_()).setFilters(filters);
                return true;
            }
        }
        InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
        System.arraycopy(filters, 0, inputFilterArr, 0, length);
        inputFilterArr[length] = new InputFilter.LengthFilter(i);
        ((C7537alh) f_()).setFilters(inputFilterArr);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] maxBytes(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            return LuaValue.varargsOf(LuaNumber.valueOf(this.fARcdN));
        }
        int i = luaValueArr[0].toInt();
        this.fARcdN = i;
        copydefault(i / 2);
        if (!this.AYXKKw) {
            this.AYXKKw = true;
            ((C7537alh) f_()).addTextChangedListener(new ActionBar());
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] returnMode(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            return LuaValue.varargsOf(LuaNumber.valueOf(((C7537alh) f_()).getImeOptions()));
        }
        ((C7537alh) f_()).setImeOptions(luaValueArr[0].toInt());
        if (!this.fIwbmz) {
            return null;
        }
        ((C7537alh) f_()).setSingleLine(false);
        ((C7537alh) f_()).setSingleLine(this.fIwbmz);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setBeginChangingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.AEQbTJ;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.AEQbTJ = luaValueArr[0].toLuaFunction();
        gEmmrt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDidChangingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.EZpvd;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.EZpvd = luaValueArr[0].toLuaFunction();
        gEmmrt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDidChangingCallbackNew(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.OLrzqt;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.OLrzqt = luaValueArr[0].toLuaFunction();
        gEmmrt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setEndChangedCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.AhwBna;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.AhwBna = luaValueArr[0].toLuaFunction();
        gEmmrt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setReturnCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.AuCTel;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaFunction luaFunction2 = luaValueArr[0].toLuaFunction();
        this.AuCTel = luaFunction2;
        if (luaFunction2 == null || this.gEmmrt) {
            return null;
        }
        this.gEmmrt = true;
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setCursorColor(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            return null;
        }
        if (f_() instanceof C7537alh) {
            ((C7537alh) f_()).setCursorColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        }
        luaValueArr[0].destroy();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setCanEdit(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            return null;
        }
        ((C7537alh) f_()).setFocusableInTouchMode(luaValueArr[0].toBoolean());
        ((C7537alh) f_()).setFocusable(luaValueArr[0].toBoolean());
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] requestFocus(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArrRequestFocus = super.requestFocus(luaValueArr);
        showKeyboard(null);
        return luaValueArrRequestFocus;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] cancelFocus(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArrCancelFocus = super.cancelFocus(luaValueArr);
        dismissKeyboard(null);
        return luaValueArrCancelFocus;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setShouldChangeCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.isConnected;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.isConnected = luaValueArr[0].toLuaFunction();
        InputFilter[] filters = ((C7537alh) f_()).getFilters();
        int length = filters.length;
        for (int i = 0; i < length; i++) {
            if (filters[i] instanceof TaskDescription) {
                filters[i] = new TaskDescription(this.isConnected, (EditText) f_());
                ((C7537alh) f_()).setFilters(filters);
                return null;
            }
        }
        InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
        System.arraycopy(filters, 0, inputFilterArr, 0, length);
        inputFilterArr[length] = new TaskDescription(this.isConnected, (EditText) f_());
        ((C7537alh) f_()).setFilters(inputFilterArr);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setKeyboardDistance(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0) {
            return null;
        }
        this.fetchVPNInfo = luaValueArr[0].toInt();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setKeyboardHandlerDisabled(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0) {
            return null;
        }
        ((C7537alh) f_()).setFocusable(luaValueArr[0].toBoolean());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showKeyboard(LuaValue[] luaValueArr) {
        ((C7537alh) f_()).postDelayed(new Runnable() { // from class: com.immomo.mls.fun.ud.view.UDEditText.3
            /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: U */
            /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: U */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                if (UDEditText.this.AubY() == null) {
                    return;
                }
                if (!((C7537alh) UDEditText.this.f_()).isFocused()) {
                    ((C7537alh) UDEditText.this.f_()).requestFocus();
                }
                ((InputMethodManager) UDEditText.this.AubY().getSystemService("input_method")).showSoftInput(UDEditText.this.f_(), 1);
            }
        }, 100L);
        ((C7537alh) f_()).setCursorVisible(true);
        AhwBna();
        return null;
    }

    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: U */
    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: U */
    /* JADX DEBUG: Type inference failed for r1v9. Raw type applied. Possible types: U */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View] */
    @InterfaceC60044zuT
    public LuaValue[] dismissKeyboard(LuaValue[] luaValueArr) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) AubY().getSystemService("input_method");
            ?? F_ = ((C7537alh) f_()).isFocused() ? f_() : 0;
            if (F_ != 0 && inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(F_.getWindowToken(), 2);
                ((C7537alh) f_()).setCursorVisible(false);
            }
        } catch (Exception e) {
            pUU.copydefault("mln", Log.getStackTraceString(e));
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setFormatter(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length >= 1) {
            UDEditTextFormatter uDEditTextFormatter = (UDEditTextFormatter) luaValueArr[0];
            this.uzCIH = uDEditTextFormatter;
            if (uDEditTextFormatter == null) {
                return null;
            }
            uDEditTextFormatter.AEQbTJ((C55001xbh) f_());
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] shouldGroup(LuaValue[] luaValueArr) {
        UDEditTextFormatter uDEditTextFormatter = this.uzCIH;
        if (uDEditTextFormatter != null) {
            return LuaValue.varargsOf(LuaBoolean.AEQbTJ(uDEditTextFormatter.OLrzqt()));
        }
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(false));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r7v11, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.immomo.mls.fun.ud.view.UDLabel
    @InterfaceC60044zuT
    public LuaValue[] text(LuaValue[] luaValueArr) {
        UDEditTextFormatter uDEditTextFormatter = this.uzCIH;
        boolean z = uDEditTextFormatter != null && (TextUtils.equals("Number", uDEditTextFormatter.KWHzl()) || TextUtils.equals("Decimal", this.uzCIH.KWHzl()));
        String string = "";
        if (luaValueArr != null && luaValueArr.length >= 1) {
            if (z) {
                ((C7537alh) f_()).setPlainNumericText(luaValueArr[0].isNil() ? "" : luaValueArr[0].toJavaString());
            } else {
                ((C7537alh) f_()).setText(luaValueArr[0].isNil() ? "" : luaValueArr[0].toJavaString());
            }
        }
        if (z) {
            string = ((C7537alh) f_()).isConnected();
            if (string.endsWith(C38303pTu.EZpvd(Locale.getDefault())) || string.endsWith(C38303pTu.EZpvd(Locale.US))) {
                string = string.substring(0, string.length() - 1);
            }
        } else if (!TextUtils.isEmpty(((C7537alh) f_()).getText())) {
            string = ((C7537alh) f_()).getText().toString();
        }
        return LuaValue.varargsOf(LuaString.copydefault(string));
    }

    @Override // com.immomo.mls.fun.ud.view.UDLabel, com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        dismissKeyboard(null);
        super.AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.immomo.mls.fun.ud.view.UDLabel
    public void AEQbTJ(int i) {
        if (i == 1) {
            ((C7537alh) f_()).setSingleLine();
        } else {
            ((C7537alh) f_()).setSingleLine(false);
        }
    }

    public void AhwBna() {
        LuaFunction luaFunction = this.AEQbTJ;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        LuaFunction luaFunction = this.OLrzqt;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaString.copydefault(charSequence.toString()), LuaNumber.valueOf(i + 1), LuaNumber.valueOf(i3)));
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        LuaFunction luaFunction = this.AhwBna;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaString.copydefault(editable.toString())));
        }
        LuaFunction luaFunction2 = this.EZpvd;
        if (luaFunction2 != null) {
            luaFunction2.invoke(LuaValue.varargsOf(LuaString.copydefault(editable.toString()), LuaNumber.valueOf(0), LuaNumber.valueOf(0)));
        }
    }

    public void AEQbTJ(boolean z) {
        LuaFunction luaFunction;
        if (!z && (luaFunction = this.AhwBna) != null) {
            luaFunction.invoke(null);
        }
        LuaFunction luaFunction2 = this.AkhnZx;
        if (luaFunction2 != null) {
            luaFunction2.invoke(LuaValue.rBoolean(z));
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] onDetachedView(LuaValue[] luaValueArr) {
        return super.onDetachedView(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        if (this.getNewProxyInstance) {
            return;
        }
        this.getNewProxyInstance = true;
        ((C7537alh) f_()).addTextChangedListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 0) {
            LuaFunction luaFunction = this.AuCTel;
            if (luaFunction != null) {
                luaFunction.invoke(null);
            }
            return this.valueOf;
        }
        if (i == 0 && keyEvent != null) {
            return false;
        }
        LuaFunction luaFunction2 = this.AuCTel;
        if (luaFunction2 != null) {
            luaFunction2.invoke(null);
        }
        return true;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public class ActionBar implements TextWatcher {
        public int AEQbTJ;
        public CharSequence KWHzl;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.KWHzl = charSequence;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: U */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (UDEditText.this.fARcdN > 0) {
                EditText editText = (EditText) UDEditText.this.f_();
                this.copydefault = editText.getSelectionStart();
                this.AEQbTJ = editText.getSelectionEnd();
                if (UDEditText.OLrzqt(this.KWHzl.toString()) > UDEditText.this.fARcdN) {
                    try {
                        editable.delete(this.copydefault - 1, this.AEQbTJ);
                        editText.setText(editable);
                        editText.setSelection(editText.getText().length());
                    } catch (Exception e) {
                        if (C7326ahi.EZpvd) {
                            pUU.copydefault("mln", Log.getStackTraceString(e));
                        }
                    }
                }
            }
        }
    }

    public static int OLrzqt(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int iCodePointCount = str.codePointCount(0, str.length());
        int iOffsetByCodePoints = str.offsetByCodePoints(0, 0);
        int iOffsetByCodePoints2 = str.offsetByCodePoints(0, iCodePointCount - 1);
        int i2 = 0;
        int i3 = iOffsetByCodePoints;
        int i4 = 0;
        while (true) {
            if (i3 > iOffsetByCodePoints2) {
                return (i * 4) + (i4 * 2) + i2;
            }
            int iCodePointAt = str.codePointAt(i3);
            i3 += Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1;
            if (OLrzqt(iCodePointAt)) {
                i4++;
            } else if (EZpvd(iCodePointAt)) {
                i++;
            } else {
                i2++;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        if (!z) {
            ((C7537alh) f_()).setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else if (this.fIwbmz) {
            ((C7537alh) f_()).setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            ((C7537alh) f_()).setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            C7833arL.KWHzl("Multi-line mode does not support password mode and should be set to single-line mode", getGlobals());
        }
    }

    public static boolean OLrzqt(int i) {
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(i);
        return unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || unicodeBlockOf == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || unicodeBlockOf == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS || unicodeBlockOf == Character.UnicodeBlock.GENERAL_PUNCTUATION;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: U */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(int i) {
        Editable text = ((C7537alh) f_()).getText();
        if (text == null || i < 0 || i > text.length()) {
            return;
        }
        ((C7537alh) f_()).setSelection(i);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class TaskDescription implements InputFilter {
        public LuaFunction KWHzl;
        public EditText copydefault;

        public TaskDescription(LuaFunction luaFunction, EditText editText) {
            this.KWHzl = luaFunction;
            this.copydefault = editText;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (C7326ahi.EZpvd) {
                C7870arw.KWHzl(UDEditText.copydefault, "filter: source  ==" + ((Object) charSequence) + "  start=====" + i + "   end======" + i2 + "   dest====" + ((Object) spanned) + "  dstart===" + i3 + "  dend==" + i4);
            }
            Editable text = this.copydefault.getText();
            String string = text != null ? text.toString() : "";
            if (i == 0 && i2 == 0) {
                charSequence = "";
            }
            LuaFunction luaFunction = this.KWHzl;
            if (luaFunction == null) {
                return null;
            }
            LuaValue[] luaValueArrInvoke = luaFunction.invoke(LuaValue.varargsOf(LuaString.copydefault(string), LuaString.copydefault(charSequence.toString()), LuaNumber.valueOf(i3 + 1), LuaNumber.valueOf(charSequence.length())));
            if (luaValueArrInvoke.length < 1 || luaValueArrInvoke[0].toBoolean()) {
                return null;
            }
            return "";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setOnBackspaceDownListener(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.DbNXlk;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.DbNXlk = luaValueArr[0].toLuaFunction();
        ((C7537alh) f_()).setOnBackspaceDownListener(new C7537alh.Activity() { // from class: o.ajO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C7537alh.Activity
            public final void EZpvd() {
                this.OLrzqt.AYXKKw();
            }
        });
        return null;
    }

    public final /* synthetic */ void AYXKKw() {
        LuaFunction luaFunction = this.DbNXlk;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setCursorPosition(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0 || !luaValueArr[0].isInt()) {
            return null;
        }
        KWHzl(luaValueArr[0].toInt());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] forbiddenReturnText(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0 && luaValueArr[0].isBoolean()) {
            this.valueOf = luaValueArr[0].isBoolean();
            return null;
        }
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(this.valueOf));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: U */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCursorPosition(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(((C7537alh) f_()).getSelectionStart());
    }

    @InterfaceC60044zuT
    public LuaValue[] setFocusChangeCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.AkhnZx;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.AkhnZx = luaValueArr[0].toLuaFunction();
        return null;
    }
}
