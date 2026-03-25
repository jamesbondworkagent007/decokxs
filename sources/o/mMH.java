package o;

import android.view.View;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.just.agentweb.AgentWeb;
import com.okinc.components.track.ABTestManager;
import com.okinc.core.util.SPUtils;
import com.okinc.network.engine.bean.EngineBean;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.C31976mKx;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mMH extends mKV {
    public java.lang.String AEQbTJ;
    public android.widget.TextView AhwBna;
    public java.lang.String AkhnZx;
    public android.widget.LinearLayout EZpvd;
    public AgentWeb KWHzl;
    public android.widget.FrameLayout OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String fetchVPNInfo;
    public android.widget.EditText gEmmrt;
    public android.widget.TextView valueOf;
    public java.lang.String values;
    public final java.lang.String isConnected = "file:///android_asset/request-detail-index.html";
    public final PendingIntent DbNXlk = new PendingIntent();
    public final LoaderManager AYXKKw = new LoaderManager();

    public static final class Activity extends C32927mmn {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public java.lang.String EZpvd() {
            return "enable_debugging_interceptor_configs";
        }
    }

    public static final class StateListAnimator extends TypeToken<java.util.Map<java.lang.String, ? extends java.lang.String>> {
    }

    public static final class TaskDescription extends TypeToken<java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mKV
    public int AEQbTJ() {
        return C31976mKx.Application.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    @Override // o.AbstractActivityC33041mov
    public boolean needHook() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AkhnZx;
    }

    @Override // o.mKV
    public void AEQbTJ(android.os.Bundle bundle) {
        this.OLrzqt = (android.widget.FrameLayout) findViewById(C31976mKx.Activity.RcXXUw);
        this.EZpvd = (android.widget.LinearLayout) findViewById(C31976mKx.Activity.DXXBbs);
        this.gEmmrt = (android.widget.EditText) findViewById(C31976mKx.Activity.AxsJAY);
        this.valueOf = (android.widget.TextView) findViewById(C31976mKx.Activity.DGOPHZDGOPHZ);
        this.AhwBna = (android.widget.TextView) findViewById(C31976mKx.Activity.UrRBLY);
        android.widget.LinearLayout linearLayout = this.EZpvd;
        if (linearLayout == null) {
            Intrinsics.gEmmrt("");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.mMJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mMH.copydefault(this.EZpvd, view);
            }
        });
        android.os.Bundle extras = getIntent().getExtras();
        java.lang.String string = SPUtils.getString("requestBody", "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
            this.AEQbTJ = string;
        }
        SPUtils.put("requestBody", "");
        this.copydefault = extras != null ? extras.getString("info") : null;
        this.fetchVPNInfo = extras != null ? extras.getString("reqBody") : null;
        this.values = extras != null ? extras.getString("requestHeaders") : null;
        this.AkhnZx = extras != null ? extras.getString("responseHeaders") : null;
        android.widget.TextView textView = this.valueOf;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.mMG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mMH.AEQbTJ(this.EZpvd, view);
                }
            });
        }
        android.widget.TextView textView2 = this.AhwBna;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.mML
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mMH.AhwBna(this.KWHzl, view);
                }
            });
        }
        android.widget.EditText editText = this.gEmmrt;
        if (editText != null) {
            editText.addTextChangedListener(new ActionBar());
        }
        gEmmrt();
    }

    public static final void copydefault(mMH mmh, android.view.View view) {
        mmh.finish();
    }

    public static final void AEQbTJ(mMH mmh, android.view.View view) {
        android.widget.EditText editText = mmh.gEmmrt;
        java.lang.String strValueOf = java.lang.String.valueOf(editText != null ? editText.getEditableText() : null);
        if (strValueOf.length() == 0) {
            return;
        }
        mmh.OLrzqt(strValueOf);
    }

    public static final void AhwBna(mMH mmh, android.view.View view) {
        java.lang.String str = "Info\n" + mmh.copydefault + "\n\nResponse Data\n" + mmh.AEQbTJ + "\n\nRequest Header\n" + mmh.values + "\n\nResponse Header\n" + mmh.AkhnZx;
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", "Export Request");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        intent.setFlags(268435456);
        mmh.startActivity(android.content.Intent.createChooser(intent, "Export Request"));
    }

    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (java.lang.String.valueOf(editable).length() == 0) {
                AgentWeb agentWeb = mMH.this.KWHzl;
                if (agentWeb == null) {
                    Intrinsics.gEmmrt("");
                    agentWeb = null;
                }
                agentWeb.getWebCreator().getWebView().clearMatches();
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        android.os.Bundle extras = intent.getExtras();
        java.lang.String string = SPUtils.getString("requestBody", "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
            this.AEQbTJ = string;
        }
        SPUtils.put("requestBody", "");
        AgentWeb agentWeb = null;
        this.copydefault = extras != null ? extras.getString("info") : null;
        this.fetchVPNInfo = extras != null ? extras.getString("reqBody") : null;
        this.values = extras != null ? extras.getString("requestHeaders") : null;
        this.AkhnZx = extras != null ? extras.getString("responseHeaders") : null;
        AgentWeb agentWeb2 = this.KWHzl;
        if (agentWeb2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            agentWeb = agentWeb2;
        }
        agentWeb.getWebCreator().getWebView().reload();
    }

    @Override // o.mKV
    public void OLrzqt() {
        AgentWeb.AgentBuilder agentBuilderWith = AgentWeb.with(this);
        android.widget.FrameLayout frameLayout = this.OLrzqt;
        AgentWeb agentWeb = null;
        if (frameLayout == null) {
            Intrinsics.gEmmrt("");
            frameLayout = null;
        }
        AgentWeb agentWebGo = agentBuilderWith.setAgentWebParent(frameLayout, new LinearLayout.LayoutParams(-1, -1)).closeIndicator().setWebChromeClient(this.AYXKKw).setWebViewClient(this.DbNXlk).createAgentWeb().ready().go(this.isConnected);
        this.KWHzl = agentWebGo;
        if (agentWebGo == null) {
            Intrinsics.gEmmrt("");
            agentWebGo = null;
        }
        agentWebGo.getAgentWebSettings().getWebSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        AgentWeb agentWeb2 = this.KWHzl;
        if (agentWeb2 == null) {
            Intrinsics.gEmmrt("");
            agentWeb2 = null;
        }
        agentWeb2.getAgentWebSettings().getWebSettings().setLoadWithOverviewMode(true);
        AgentWeb agentWeb3 = this.KWHzl;
        if (agentWeb3 == null) {
            Intrinsics.gEmmrt("");
            agentWeb3 = null;
        }
        agentWeb3.getAgentWebSettings().getWebSettings().setUseWideViewPort(true);
        AgentWeb agentWeb4 = this.KWHzl;
        if (agentWeb4 == null) {
            Intrinsics.gEmmrt("");
            agentWeb4 = null;
        }
        agentWeb4.getAgentWebSettings().getWebSettings().setSupportZoom(true);
        AgentWeb agentWeb5 = this.KWHzl;
        if (agentWeb5 == null) {
            Intrinsics.gEmmrt("");
            agentWeb5 = null;
        }
        agentWeb5.getAgentWebSettings().getWebSettings().setBuiltInZoomControls(true);
        AgentWeb agentWeb6 = this.KWHzl;
        if (agentWeb6 == null) {
            Intrinsics.gEmmrt("");
            agentWeb6 = null;
        }
        agentWeb6.getAgentWebSettings().getWebSettings().setDisplayZoomControls(false);
        AgentWeb agentWeb7 = this.KWHzl;
        if (agentWeb7 == null) {
            Intrinsics.gEmmrt("");
            agentWeb7 = null;
        }
        agentWeb7.getAgentWebSettings().getWebSettings().setUserAgentString("");
        AgentWeb agentWeb8 = this.KWHzl;
        if (agentWeb8 == null) {
            Intrinsics.gEmmrt("");
            agentWeb8 = null;
        }
        agentWeb8.getAgentWebSettings().getWebSettings().setJavaScriptEnabled(true);
        AgentWeb agentWeb9 = this.KWHzl;
        if (agentWeb9 == null) {
            Intrinsics.gEmmrt("");
            agentWeb9 = null;
        }
        agentWeb9.getAgentWebSettings().getWebSettings().setDomStorageEnabled(true);
        AgentWeb agentWeb10 = this.KWHzl;
        if (agentWeb10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            agentWeb = agentWeb10;
        }
        agentWeb.getAgentWebSettings().getWebSettings().setAllowContentAccess(true);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AgentWeb agentWeb = this.KWHzl;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        agentWeb.getWebCreator().getWebView().findAll(str);
    }

    public static final class PendingIntent extends com.just.agentweb.WebViewClient {
        public PendingIntent() {
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageFinished(webView, str);
            AgentWeb agentWeb = mMH.this.KWHzl;
            AgentWeb agentWeb2 = null;
            if (agentWeb == null) {
                Intrinsics.gEmmrt("");
                agentWeb = null;
            }
            if (agentWeb.getWebCreator().getWebView().getProgress() == 100) {
                AgentWeb agentWeb3 = mMH.this.KWHzl;
                if (agentWeb3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    agentWeb2 = agentWeb3;
                }
                agentWeb2.getWebCreator().getWebView().setVisibility(0);
            }
        }
    }

    public static final class LoaderManager extends com.just.agentweb.WebChromeClient {
        public LoaderManager() {
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView webView, int i) {
            Intrinsics.checkNotNullParameter(webView, "");
            if (i == 100) {
                AgentWeb agentWeb = null;
                if (!android.text.TextUtils.isEmpty(mMH.this.EZpvd())) {
                    AgentWeb agentWeb2 = mMH.this.KWHzl;
                    if (agentWeb2 == null) {
                        Intrinsics.gEmmrt("");
                        agentWeb2 = null;
                    }
                    agentWeb2.getJsAccessEntrace().quickCallJs("updateInfo", mMH.this.EZpvd());
                }
                if (!android.text.TextUtils.isEmpty(mMH.this.AhwBna())) {
                    AgentWeb agentWeb3 = mMH.this.KWHzl;
                    if (agentWeb3 == null) {
                        Intrinsics.gEmmrt("");
                        agentWeb3 = null;
                    }
                    agentWeb3.getJsAccessEntrace().quickCallJs("updateReqBody", mMH.this.AhwBna());
                }
                if (!android.text.TextUtils.isEmpty(mMH.this.AYXKKw())) {
                    AgentWeb agentWeb4 = mMH.this.KWHzl;
                    if (agentWeb4 == null) {
                        Intrinsics.gEmmrt("");
                        agentWeb4 = null;
                    }
                    agentWeb4.getJsAccessEntrace().quickCallJs("updateRequestHeader", mMH.this.AYXKKw());
                }
                if (!android.text.TextUtils.isEmpty(mMH.this.KWHzl())) {
                    AgentWeb agentWeb5 = mMH.this.KWHzl;
                    if (agentWeb5 == null) {
                        Intrinsics.gEmmrt("");
                        agentWeb5 = null;
                    }
                    agentWeb5.getJsAccessEntrace().quickCallJs("updateResponseJSONData", mMH.this.KWHzl());
                }
                if (!android.text.TextUtils.isEmpty(mMH.this.valueOf())) {
                    AgentWeb agentWeb6 = mMH.this.KWHzl;
                    if (agentWeb6 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        agentWeb = agentWeb6;
                    }
                    agentWeb.getJsAccessEntrace().quickCallJs("updateResponseHeader", mMH.this.valueOf());
                }
            }
            super.onProgressChanged(webView, i);
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(jsPromptResult, "");
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        AgentWeb agentWeb = this.KWHzl;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        agentWeb.getWebLifeCycle().onPause();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AgentWeb agentWeb = this.KWHzl;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        agentWeb.getWebLifeCycle().onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AgentWeb agentWeb = this.KWHzl;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        agentWeb.getWebLifeCycle().onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NotNull android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "");
        AgentWeb agentWeb = this.KWHzl;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        if (agentWeb.handleKeyEvent(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onClickTest(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AgentWeb agentWeb = this.KWHzl;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        agentWeb.getWebCreator().getWebView().reload();
    }

    private final void gEmmrt() {
        final android.view.View viewFindViewById = findViewById(C31976mKx.Activity.QSBOWP);
        if (ABTestManager.isEnabled$default(ABTestManager.AEQbTJ, new Activity(), null, 2, null)) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
        final android.widget.EditText editText = (android.widget.EditText) findViewById(C31976mKx.Activity.QHmsKR);
        Intrinsics.copydefault(editText);
        EZpvd(editText);
        C43270rmC c43270rmC = C43270rmC.OLrzqt;
        if (c43270rmC.KWHzl() != null) {
            java.lang.String json = new Gson().toJson(c43270rmC.KWHzl());
            Intrinsics.copydefault((java.lang.Object) json);
            editText.setText(new android.text.SpannableStringBuilder(copydefault(json)));
        }
        android.widget.Button button = (android.widget.Button) findViewById(C31976mKx.Activity.zuWLRA);
        final android.widget.TextView textView = (android.widget.TextView) findViewById(C31976mKx.Activity.OuxcSI);
        textView.setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
        ((AppCompatImageView) findViewById(C31976mKx.Activity.ffGIBT)).setOnClickListener(new View.OnClickListener() { // from class: o.mMK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mMH.copydefault(viewFindViewById, view);
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: o.mMN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mMH.copydefault(editText, this, textView, view);
            }
        });
    }

    public static final void copydefault(android.view.View view, android.view.View view2) {
        view.setVisibility(8);
    }

    public static final void copydefault(android.widget.EditText editText, mMH mmh, android.widget.TextView textView, android.view.View view) {
        try {
            if (C43270rmC.OLrzqt.EZpvd(editText.getText().toString())) {
                SPUtils.put("payload_key_prefix_network_interceptor_experiment_key", editText.getText().toString(), "cefi_ab_test");
                C55326xho.toastWithSuccessfulIcon$default("match rule save success", 0, 1, (java.lang.Object) null);
            } else {
                C55326xho.toastWithFailedIcon$default("match rule save failure,data exception", 0, 1, (java.lang.Object) null);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) editText.getText().toString())) {
                int selectionStart = editText.getSelectionStart();
                editText.setText(new android.text.SpannableStringBuilder(mmh.copydefault(editText.getText().toString())));
                if (selectionStart > editText.getText().length()) {
                    selectionStart = editText.getText().length();
                }
                editText.setSelection(selectionStart);
            }
            EngineBean.Rule ruleEZpvd = C43274rmG.EZpvd.EZpvd(mmh.copydefault());
            if (ruleEZpvd != null) {
                textView.setText("This Http Request match rule name:" + ruleEZpvd.getName());
                return;
            }
            textView.setText("This Http Request do not match any rule");
        } catch (JsonSyntaxException e) {
            textView.setText("JSON format error " + e.getMessage());
        } catch (java.lang.Exception e2) {
            textView.setText(java.lang.String.valueOf(e2.getMessage()));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
    
        if (r7.equals("DELETE") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0118, code lost:
    
        if (r7.equals("PATCH") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        if (r7.equals("POST") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012a, code lost:
    
        if (r7.equals("HEAD") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0133, code lost:
    
        if (r7.equals("PUT") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0135, code lost:
    
        if (r5 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0137, code lost:
    
        r1 = r1.toUpperCase(r4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r3.method(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0158, code lost:
    
        throw new java.lang.IllegalArgumentException(r1 + " request must have a body.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x015f, code lost:
    
        if (r7.equals("GET") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0161, code lost:
    
        r1 = r1.toUpperCase(r4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r3.method(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016f, code lost:
    
        return r3.build();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Request copydefault() {
        java.util.Map mapKWHzl;
        RequestBody requestBodyCreate;
        java.lang.Object objFromJson = new Gson().fromJson(this.copydefault, new StateListAnimator().getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        java.util.Map map = (java.util.Map) objFromJson;
        java.lang.String str = (java.lang.String) map.get("url");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) map.get("Method");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.values;
        if (str3 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
            java.lang.Object objFromJson2 = new Gson().fromJson(this.values, new TaskDescription().getType());
            Intrinsics.copydefault(objFromJson2);
            mapKWHzl = (java.util.Map) objFromJson2;
        } else {
            mapKWHzl = C56424yEw.KWHzl();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(mapKWHzl.size()));
        for (Map.Entry entry : mapKWHzl.entrySet()) {
            linkedHashMap.put(entry.getKey(), CollectionsKt___CollectionsKt.joinToString$default((java.util.List) entry.getValue(), ", ", null, null, 0, null, null, 62, null));
        }
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            builder.add((java.lang.String) entry2.getKey(), (java.lang.String) entry2.getValue());
        }
        java.lang.String str4 = this.fetchVPNInfo;
        if (str4 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4)) {
            requestBodyCreate = null;
        } else {
            MediaType mediaType = MediaType.Companion.parse("application/json");
            RequestBody.Companion companion = RequestBody.Companion;
            java.lang.String str5 = this.fetchVPNInfo;
            Intrinsics.copydefault((java.lang.Object) str5);
            requestBodyCreate = companion.create(str5, mediaType);
        }
        Request.Builder builderHeaders = new Request.Builder().url(str).headers(builder.build());
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = str2.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        switch (upperCase.hashCode()) {
            case 70454:
                break;
            case 79599:
                break;
            case 2213344:
                break;
            case 2461856:
                break;
            case 75900968:
                break;
            case 2012838315:
                break;
            default:
                throw new java.lang.IllegalArgumentException("Unsupported HTTP method: " + str2);
        }
    }

    public final java.lang.String copydefault(java.lang.String str) {
        try {
            Gson gsonCreate = new GsonBuilder().setPrettyPrinting().create();
            Intrinsics.checkNotNullExpressionValue(gsonCreate, "");
            java.lang.String json = gsonCreate.toJson((JsonElement) gsonCreate.fromJson(str, JsonObject.class));
            Intrinsics.copydefault((java.lang.Object) json);
            return json;
        } catch (java.lang.Throwable unused) {
            return str;
        }
    }

    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ android.widget.EditText EZpvd;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(android.widget.EditText editText) {
            this.EZpvd = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (editable == null || editable.length() == 0) {
                return;
            }
            this.EZpvd.removeTextChangedListener(this);
            int selectionStart = this.EZpvd.getSelectionStart();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(editable.toString());
            Regex regex = new Regex("\"[^\"]*\"(?=\\s*:)");
            Regex regex2 = new Regex(":\\s*\"[^\"]*\"");
            for (MatchResult matchResult : Regex.findAll$default(regex, editable, 0, 2, null)) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(-16776961), matchResult.copydefault().KWHzl(), matchResult.copydefault().copydefault() + 1, 33);
            }
            for (MatchResult matchResult2 : Regex.findAll$default(regex2, editable, 0, 2, null)) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(-16711936), matchResult2.copydefault().KWHzl(), matchResult2.copydefault().copydefault() + 1, 33);
            }
            this.EZpvd.setText(spannableStringBuilder);
            this.EZpvd.setSelection(selectionStart);
            this.EZpvd.addTextChangedListener(this);
        }
    }

    public final void EZpvd(android.widget.EditText editText) {
        editText.addTextChangedListener(new Application(editText));
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
