package com.okinc.liveness.lca.debugtool.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.core.internal.view.SupportMenu;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.liveness.lca.debugtool.data.Challenge;
import com.okinc.liveness.lca.debugtool.data.LcaAiAlgoLivenessCollectionResponse;
import com.okinc.liveness.lca.debugtool.data.LcaAiAlgoLivenessData;
import com.okinc.liveness.lca.debugtool.data.LcaAiAlgoLivenessPredictionResponse;
import com.okinc.liveness.lca.debugtool.data.LcaColorChallenge;
import com.okinc.liveness.lca.debugtool.data.LcaDebugDataManager;
import com.okinc.liveness.lca.debugtool.data.LcaJwstModelResult;
import com.okinc.liveness.lca.debugtool.data.LcaJwstQueryResultData;
import com.okinc.liveness.lca.debugtool.data.LivenessResponse;
import com.okinc.liveness.lca.debugtool.utils.LcaDebugSettingHelper;
import com.okinc.liveness.lca.utils.LcaMediaUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C34717nhc;
import o.C45694suq;
import o.C45703suz;
import o.C52794wYp;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;
import o.yDY;
import o.yFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaDebugResultActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public C45694suq binding;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IOException {
        super.onCreate(bundle);
        C45694suq c45694suqAEQbTJ = C45694suq.AEQbTJ(getLayoutInflater());
        this.binding = c45694suqAEQbTJ;
        if (c45694suqAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c45694suqAEQbTJ = null;
        }
        setContentView(c45694suqAEQbTJ.getRoot());
        displayApiResult();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C34717nhc.Companion.copydefault(this);
    }

    public final void displayApiResult() throws IOException {
        LcaDebugDataManager lcaDebugDataManager = LcaDebugDataManager.INSTANCE;
        LivenessResponse response = lcaDebugDataManager.getResponse();
        if (response != null) {
            if (response instanceof LcaJwstQueryResultData) {
                LcaJwstQueryResultData lcaJwstQueryResultData = (LcaJwstQueryResultData) response;
                handleJwstQueryResultResponse(lcaJwstQueryResultData.getWsSessionId(), lcaJwstQueryResultData.getModelResult());
            } else if (response instanceof LcaAiAlgoLivenessPredictionResponse) {
                handlePredictionResponse((LcaAiAlgoLivenessPredictionResponse) response);
            } else if (response instanceof LcaAiAlgoLivenessCollectionResponse) {
                handleCollectionResponse((LcaAiAlgoLivenessCollectionResponse) response);
            }
        }
        String error = lcaDebugDataManager.getError();
        if (error != null) {
            handleError(error);
        }
    }

    public final void handleError(String str) {
        C45694suq c45694suq = this.binding;
        C45694suq c45694suq2 = null;
        if (c45694suq == null) {
            Intrinsics.gEmmrt("");
            c45694suq = null;
        }
        c45694suq.values.setVisibility(8);
        C45694suq c45694suq3 = this.binding;
        if (c45694suq3 == null) {
            Intrinsics.gEmmrt("");
            c45694suq3 = null;
        }
        c45694suq3.fIwbmz.setVisibility(0);
        C45694suq c45694suq4 = this.binding;
        if (c45694suq4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45694suq2 = c45694suq4;
        }
        c45694suq2.fIwbmz.setText(str);
    }

    public final void handleCollectionResponse(LcaAiAlgoLivenessCollectionResponse lcaAiAlgoLivenessCollectionResponse) {
        C45694suq c45694suq = this.binding;
        C45694suq c45694suq2 = null;
        if (c45694suq == null) {
            Intrinsics.gEmmrt("");
            c45694suq = null;
        }
        c45694suq.fIwbmz.setVisibility(0);
        C45694suq c45694suq3 = this.binding;
        if (c45694suq3 == null) {
            Intrinsics.gEmmrt("");
            c45694suq3 = null;
        }
        c45694suq3.fIwbmz.setText("Error Message: " + lcaAiAlgoLivenessCollectionResponse.getMessage() + "\nSize: " + lcaAiAlgoLivenessCollectionResponse.getSize() + "\n\nRaw Response:" + LcaDebugDataManager.INSTANCE.getResponseRawJson());
        C45694suq c45694suq4 = this.binding;
        if (c45694suq4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45694suq2 = c45694suq4;
        }
        c45694suq2.fIwbmz.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return LcaDebugResultActivity.handleCollectionResponse$lambda$2(this.f$0, view);
            }
        });
    }

    public static final boolean handleCollectionResponse$lambda$2(LcaDebugResultActivity lcaDebugResultActivity, View view) {
        String responseRawJson = LcaDebugDataManager.INSTANCE.getResponseRawJson();
        if (responseRawJson == null) {
            responseRawJson = "";
        }
        lcaDebugResultActivity.copyToClipboard("responseRawJson", responseRawJson);
        return true;
    }

    public final void handlePredictionResponse(LcaAiAlgoLivenessPredictionResponse lcaAiAlgoLivenessPredictionResponse) throws IOException {
        LcaAiAlgoLivenessData data = lcaAiAlgoLivenessPredictionResponse.getData();
        if (data != null) {
            C45694suq c45694suq = this.binding;
            C45694suq c45694suq2 = null;
            if (c45694suq == null) {
                Intrinsics.gEmmrt("");
                c45694suq = null;
            }
            int i = 0;
            c45694suq.values.setVisibility(0);
            C45694suq c45694suq3 = this.binding;
            if (c45694suq3 == null) {
                Intrinsics.gEmmrt("");
                c45694suq3 = null;
            }
            LinearLayout linearLayout = c45694suq3.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            C45694suq c45694suq4 = this.binding;
            if (c45694suq4 == null) {
                Intrinsics.gEmmrt("");
                c45694suq4 = null;
            }
            LinearLayout linearLayout2 = c45694suq4.isConnected;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
            final File videoTempFile = LcaDebugDataManager.INSTANCE.getVideoTempFile();
            if (videoTempFile != null) {
                C45694suq c45694suq5 = this.binding;
                if (c45694suq5 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq5 = null;
                }
                c45694suq5.gHZMYf.setVideoPath(videoTempFile.getPath());
                C45694suq c45694suq6 = this.binding;
                if (c45694suq6 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq6 = null;
                }
                c45694suq6.gHZMYf.start();
                C45694suq c45694suq7 = this.binding;
                if (c45694suq7 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq7 = null;
                }
                c45694suq7.gHZMYf.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda10
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws FileNotFoundException {
                        this.f$0.saveVideoToGallery(videoTempFile);
                    }
                });
                C45694suq c45694suq8 = this.binding;
                if (c45694suq8 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq8 = null;
                }
                TextView textView = c45694suq8.AubY;
                LcaMediaUtils lcaMediaUtils = LcaMediaUtils.INSTANCE;
                textView.setText(lcaMediaUtils.getEncodeCodecStr(videoTempFile));
                C45694suq c45694suq9 = this.binding;
                if (c45694suq9 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq9 = null;
                }
                c45694suq9.AwvSrB.setText(videoTempFile.length() + " B");
                C45694suq c45694suq10 = this.binding;
                if (c45694suq10 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq10 = null;
                }
                c45694suq10.zuBGHE.setText(lcaMediaUtils.getVideoDuration(videoTempFile) + " ms");
            }
            String firstReferenceFrame = data.getFirstReferenceFrame();
            if (firstReferenceFrame != null) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new LcaDebugResultActivity$handlePredictionResponse$1$2$1(firstReferenceFrame, this, null), 3, null);
            }
            C45694suq c45694suq11 = this.binding;
            if (c45694suq11 == null) {
                Intrinsics.gEmmrt("");
                c45694suq11 = null;
            }
            c45694suq11.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda11
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LcaDebugResultActivity.handlePredictionResponse$lambda$24$lambda$7(this.f$0, view);
                }
            });
            String lastReferenceFrame = data.getLastReferenceFrame();
            if (lastReferenceFrame != null) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new LcaDebugResultActivity$handlePredictionResponse$1$4$1(lastReferenceFrame, this, null), 3, null);
            }
            C45694suq c45694suq12 = this.binding;
            if (c45694suq12 == null) {
                Intrinsics.gEmmrt("");
                c45694suq12 = null;
            }
            c45694suq12.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda12
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LcaDebugResultActivity.handlePredictionResponse$lambda$24$lambda$10(this.f$0, view);
                }
            });
            C45694suq c45694suq13 = this.binding;
            if (c45694suq13 == null) {
                Intrinsics.gEmmrt("");
                c45694suq13 = null;
            }
            C52794wYp c52794wYp = c45694suq13.copydefault;
            LcaDebugSettingHelper lcaDebugSettingHelper = LcaDebugSettingHelper.INSTANCE;
            c52794wYp.setVisibility(Intrinsics.EZpvd((Object) lcaDebugSettingHelper.getVideoOutputWay(), (Object) lcaDebugSettingHelper.getVIDEO_OUTPUT_SEGMENT()) ? 0 : 8);
            C45694suq c45694suq14 = this.binding;
            if (c45694suq14 == null) {
                Intrinsics.gEmmrt("");
                c45694suq14 = null;
            }
            c45694suq14.copydefault.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda13
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LcaDebugResultActivity.handlePredictionResponse$lambda$24$lambda$11(this.f$0, view);
                }
            });
            Boolean livenessResult = data.getLivenessResult();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.EZpvd(livenessResult, bool)) {
                C45694suq c45694suq15 = this.binding;
                if (c45694suq15 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq15 = null;
                }
                c45694suq15.getNewProxyInstance.setText("PASS");
                C45694suq c45694suq16 = this.binding;
                if (c45694suq16 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq16 = null;
                }
                c45694suq16.getNewProxyInstance.setTextColor(-16711936);
            } else {
                C45694suq c45694suq17 = this.binding;
                if (c45694suq17 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq17 = null;
                }
                c45694suq17.getNewProxyInstance.setText("FAIL");
                C45694suq c45694suq18 = this.binding;
                if (c45694suq18 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq18 = null;
                }
                c45694suq18.getNewProxyInstance.setTextColor(SupportMenu.CATEGORY_MASK);
            }
            C45694suq c45694suq19 = this.binding;
            if (c45694suq19 == null) {
                Intrinsics.gEmmrt("");
                c45694suq19 = null;
            }
            c45694suq19.fJNWhG.setText("NA");
            C45694suq c45694suq20 = this.binding;
            if (c45694suq20 == null) {
                Intrinsics.gEmmrt("");
                c45694suq20 = null;
            }
            c45694suq20.zLjUOn.setText(data.getPredictionSamePerson() == null ? "NA" : Intrinsics.EZpvd(data.getPredictionSamePerson(), bool) ? "PASS" : "FAIL");
            C45694suq c45694suq21 = this.binding;
            if (c45694suq21 == null) {
                Intrinsics.gEmmrt("");
                c45694suq21 = null;
            }
            c45694suq21.hDKMBd.setText(Intrinsics.EZpvd(data.getPredictionFaceQc(), bool) ? "PASS" : "FAIL");
            C45694suq c45694suq22 = this.binding;
            if (c45694suq22 == null) {
                Intrinsics.gEmmrt("");
                c45694suq22 = null;
            }
            c45694suq22.uzCIH.setText(Intrinsics.EZpvd(data.getPredictionGlasses(), bool) ? "YES" : "NO");
            C45694suq c45694suq23 = this.binding;
            if (c45694suq23 == null) {
                Intrinsics.gEmmrt("");
                c45694suq23 = null;
            }
            c45694suq23.getFieldNames.setText(Intrinsics.EZpvd(data.getPredictionGrimace(), bool) ? "YES" : "NO");
            C45694suq c45694suq24 = this.binding;
            if (c45694suq24 == null) {
                Intrinsics.gEmmrt("");
                c45694suq24 = null;
            }
            c45694suq24.AuCTelauCTel.setText(Intrinsics.EZpvd(data.getPredictionPad(), bool) ? "PASS" : "FAIL");
            C45694suq c45694suq25 = this.binding;
            if (c45694suq25 == null) {
                Intrinsics.gEmmrt("");
                c45694suq25 = null;
            }
            c45694suq25.iwGUEr.setText(Intrinsics.EZpvd(data.getPredictionGoodLighting(), bool) ? "PASS" : "FAIL");
            C45694suq c45694suq26 = this.binding;
            if (c45694suq26 == null) {
                Intrinsics.gEmmrt("");
                c45694suq26 = null;
            }
            c45694suq26.AuCTel.setText(data.getPredictionBorder() != null ? Intrinsics.EZpvd(data.getPredictionBorder(), bool) ? "PASS" : "FAIL" : "NA");
            C45694suq c45694suq27 = this.binding;
            if (c45694suq27 == null) {
                Intrinsics.gEmmrt("");
                c45694suq27 = null;
            }
            c45694suq27.wlaJM.setText(Intrinsics.EZpvd(data.getPredictionColorSequence(), bool) ? "PASS" : "FAIL");
            C45694suq c45694suq28 = this.binding;
            if (c45694suq28 == null) {
                Intrinsics.gEmmrt("");
                c45694suq28 = null;
            }
            c45694suq28.djBIcL.removeAllViews();
            List<Challenge> challenges = data.getChallenges();
            if (challenges != null) {
                int i2 = 0;
                int i3 = 0;
                for (Object obj : challenges) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        yDY.AYXKKw();
                    }
                    Challenge challenge = (Challenge) obj;
                    LayoutInflater layoutInflater = getLayoutInflater();
                    C45694suq c45694suq29 = this.binding;
                    if (c45694suq29 == null) {
                        Intrinsics.gEmmrt("");
                        c45694suq29 = null;
                    }
                    C45703suz c45703suzKWHzl = C45703suz.KWHzl(layoutInflater, c45694suq29.djBIcL, false);
                    Intrinsics.checkNotNullExpressionValue(c45703suzKWHzl, "");
                    c45703suzKWHzl.OLrzqt.setText("Challenge Color " + i4);
                    c45703suzKWHzl.EZpvd.setText(challenge.getLabel());
                    c45703suzKWHzl.AEQbTJ.setText("Predicted Color " + i4);
                    c45703suzKWHzl.KWHzl.setText(challenge.getPrediction());
                    if (Intrinsics.EZpvd((Object) challenge.getLabel(), (Object) challenge.getPrediction())) {
                        i2++;
                    } else {
                        c45703suzKWHzl.KWHzl.setTextColor(SupportMenu.CATEGORY_MASK);
                    }
                    C45694suq c45694suq30 = this.binding;
                    if (c45694suq30 == null) {
                        Intrinsics.gEmmrt("");
                        c45694suq30 = null;
                    }
                    c45694suq30.djBIcL.addView(c45703suzKWHzl.getRoot());
                    i3 = i4;
                }
                i = i2;
            }
            List<Challenge> challenges2 = data.getChallenges();
            if (challenges2 != null) {
                C45694suq c45694suq31 = this.binding;
                if (c45694suq31 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq31 = null;
                }
                c45694suq31.fARcdN.setText(i + "/" + challenges2.size());
            }
            C45694suq c45694suq32 = this.binding;
            if (c45694suq32 == null) {
                Intrinsics.gEmmrt("");
                c45694suq32 = null;
            }
            TextView textView2 = c45694suq32.zsXlph;
            String requestId = data.getRequestId();
            if (requestId == null) {
                requestId = "No Value";
            }
            textView2.setText(requestId);
            C45694suq c45694suq33 = this.binding;
            if (c45694suq33 == null) {
                Intrinsics.gEmmrt("");
                c45694suq33 = null;
            }
            c45694suq33.ejfBZ.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda14
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LcaDebugResultActivity.handlePredictionResponse$lambda$24$lambda$14(this.f$0, view);
                }
            });
            C45694suq c45694suq34 = this.binding;
            if (c45694suq34 == null) {
                Intrinsics.gEmmrt("");
                c45694suq34 = null;
            }
            c45694suq34.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda15
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LcaDebugResultActivity.handlePredictionResponse$lambda$24$lambda$15(this.f$0, view);
                }
            });
            C45694suq c45694suq35 = this.binding;
            if (c45694suq35 == null) {
                Intrinsics.gEmmrt("");
                c45694suq35 = null;
            }
            c45694suq35.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda16
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LcaDebugResultActivity.handlePredictionResponse$lambda$24$lambda$16(this.f$0, view);
                }
            });
            C45694suq c45694suq36 = this.binding;
            if (c45694suq36 == null) {
                Intrinsics.gEmmrt("");
                c45694suq36 = null;
            }
            c45694suq36.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda17
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LcaDebugResultActivity.handlePredictionResponse$lambda$24$lambda$20(this.f$0, view);
                }
            });
            C45694suq c45694suq37 = this.binding;
            if (c45694suq37 == null) {
                Intrinsics.gEmmrt("");
                c45694suq37 = null;
            }
            c45694suq37.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda18
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws FileNotFoundException {
                    LcaDebugResultActivity.handlePredictionResponse$lambda$24$lambda$22(this.f$0, view);
                }
            });
            C45694suq c45694suq38 = this.binding;
            if (c45694suq38 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45694suq2 = c45694suq38;
            }
            c45694suq2.valueOf.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda19
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.shareVideo();
                }
            });
            pUU.valueOf("IVO", lcaAiAlgoLivenessPredictionResponse.toString());
        }
    }

    public static final void handlePredictionResponse$lambda$24$lambda$7(LcaDebugResultActivity lcaDebugResultActivity, View view) {
        Intrinsics.copydefault(view, "");
        Drawable drawable = ((ImageView) view).getDrawable();
        Bitmap bitmap$default = drawable != null ? DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null) : null;
        if (bitmap$default != null) {
            lcaDebugResultActivity.saveImageToGallery(bitmap$default, lcaDebugResultActivity);
        }
    }

    public static final void handlePredictionResponse$lambda$24$lambda$10(LcaDebugResultActivity lcaDebugResultActivity, View view) {
        Intrinsics.copydefault(view, "");
        Drawable drawable = ((ImageView) view).getDrawable();
        Bitmap bitmap$default = drawable != null ? DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null) : null;
        if (bitmap$default != null) {
            lcaDebugResultActivity.saveImageToGallery(bitmap$default, lcaDebugResultActivity);
        }
    }

    public static final void handlePredictionResponse$lambda$24$lambda$11(LcaDebugResultActivity lcaDebugResultActivity, View view) {
        lcaDebugResultActivity.startActivity(new Intent(lcaDebugResultActivity, (Class<?>) LcaDebugChunkListActivity.class));
    }

    public static final void handlePredictionResponse$lambda$24$lambda$14(LcaDebugResultActivity lcaDebugResultActivity, View view) {
        C45694suq c45694suq = lcaDebugResultActivity.binding;
        if (c45694suq == null) {
            Intrinsics.gEmmrt("");
            c45694suq = null;
        }
        lcaDebugResultActivity.copyToClipboard("binding.tvRequestId", c45694suq.zsXlph.getText().toString());
    }

    public static final void handlePredictionResponse$lambda$24$lambda$15(LcaDebugResultActivity lcaDebugResultActivity, View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lcaDebugResultActivity), Dispatchers.getDefault(), null, new LcaDebugResultActivity$handlePredictionResponse$1$10$1(lcaDebugResultActivity, null), 2, null);
    }

    public static final void handlePredictionResponse$lambda$24$lambda$16(LcaDebugResultActivity lcaDebugResultActivity, View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lcaDebugResultActivity), null, null, new LcaDebugResultActivity$handlePredictionResponse$1$11$1(lcaDebugResultActivity, null), 3, null);
    }

    public static final void handlePredictionResponse$lambda$24$lambda$20(final LcaDebugResultActivity lcaDebugResultActivity, View view) {
        final String qcScoreResultJson = LcaDebugDataManager.INSTANCE.getQcScoreResultJson();
        if (qcScoreResultJson != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(lcaDebugResultActivity);
            viewOnClickListenerC54939xaY.setTitle("Frame QC Score");
            viewOnClickListenerC54939xaY.EZpvd(qcScoreResultJson);
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) "OK", (View.OnClickListener) null);
            viewOnClickListenerC54939xaY.AEQbTJ("Copy", new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda20
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f$0.copyToClipboard("LcaDebugManager.responseRawJson", qcScoreResultJson);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void handlePredictionResponse$lambda$24$lambda$22(LcaDebugResultActivity lcaDebugResultActivity, View view) throws FileNotFoundException {
        File videoTempFile = LcaDebugDataManager.INSTANCE.getVideoTempFile();
        if (videoTempFile != null) {
            lcaDebugResultActivity.saveVideoToGallery(videoTempFile);
        }
    }

    public final void handleJwstQueryResultResponse(String str, LcaJwstModelResult lcaJwstModelResult) throws IOException {
        C45694suq c45694suq = this.binding;
        C45694suq c45694suq2 = null;
        if (c45694suq == null) {
            Intrinsics.gEmmrt("");
            c45694suq = null;
        }
        int i = 0;
        c45694suq.values.setVisibility(0);
        C45694suq c45694suq3 = this.binding;
        if (c45694suq3 == null) {
            Intrinsics.gEmmrt("");
            c45694suq3 = null;
        }
        LinearLayout linearLayout = c45694suq3.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        C45694suq c45694suq4 = this.binding;
        if (c45694suq4 == null) {
            Intrinsics.gEmmrt("");
            c45694suq4 = null;
        }
        LinearLayout linearLayout2 = c45694suq4.isConnected;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(0);
        final File videoTempFile = LcaDebugDataManager.INSTANCE.getVideoTempFile();
        if (videoTempFile != null) {
            C45694suq c45694suq5 = this.binding;
            if (c45694suq5 == null) {
                Intrinsics.gEmmrt("");
                c45694suq5 = null;
            }
            c45694suq5.AYXKKw.setVideoPath(videoTempFile.getPath());
            C45694suq c45694suq6 = this.binding;
            if (c45694suq6 == null) {
                Intrinsics.gEmmrt("");
                c45694suq6 = null;
            }
            c45694suq6.AYXKKw.start();
            C45694suq c45694suq7 = this.binding;
            if (c45694suq7 == null) {
                Intrinsics.gEmmrt("");
                c45694suq7 = null;
            }
            c45694suq7.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws FileNotFoundException {
                    this.f$0.saveVideoToGallery(videoTempFile);
                }
            });
            C45694suq c45694suq8 = this.binding;
            if (c45694suq8 == null) {
                Intrinsics.gEmmrt("");
                c45694suq8 = null;
            }
            TextView textView = c45694suq8.AubY;
            LcaMediaUtils lcaMediaUtils = LcaMediaUtils.INSTANCE;
            textView.setText(lcaMediaUtils.getEncodeCodecStr(videoTempFile));
            C45694suq c45694suq9 = this.binding;
            if (c45694suq9 == null) {
                Intrinsics.gEmmrt("");
                c45694suq9 = null;
            }
            c45694suq9.AwvSrB.setText(videoTempFile.length() + " B");
            C45694suq c45694suq10 = this.binding;
            if (c45694suq10 == null) {
                Intrinsics.gEmmrt("");
                c45694suq10 = null;
            }
            c45694suq10.zuBGHE.setText(lcaMediaUtils.getVideoDuration(videoTempFile) + " ms");
            C45694suq c45694suq11 = this.binding;
            if (c45694suq11 == null) {
                Intrinsics.gEmmrt("");
                c45694suq11 = null;
            }
            c45694suq11.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws FileNotFoundException {
                    this.f$0.saveVideoToGallery(videoTempFile);
                }
            });
        }
        C45694suq c45694suq12 = this.binding;
        if (c45694suq12 == null) {
            Intrinsics.gEmmrt("");
            c45694suq12 = null;
        }
        C52794wYp c52794wYp = c45694suq12.copydefault;
        LcaDebugSettingHelper lcaDebugSettingHelper = LcaDebugSettingHelper.INSTANCE;
        c52794wYp.setVisibility(Intrinsics.EZpvd((Object) lcaDebugSettingHelper.getVideoOutputWay(), (Object) lcaDebugSettingHelper.getVIDEO_OUTPUT_SEGMENT()) ? 0 : 8);
        C45694suq c45694suq13 = this.binding;
        if (c45694suq13 == null) {
            Intrinsics.gEmmrt("");
            c45694suq13 = null;
        }
        c45694suq13.copydefault.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugResultActivity.handleJwstQueryResultResponse$lambda$28(this.f$0, view);
            }
        });
        Boolean livenessResult = lcaJwstModelResult.getLivenessResult();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.EZpvd(livenessResult, bool)) {
            C45694suq c45694suq14 = this.binding;
            if (c45694suq14 == null) {
                Intrinsics.gEmmrt("");
                c45694suq14 = null;
            }
            c45694suq14.getNewProxyInstance.setText("PASS");
            C45694suq c45694suq15 = this.binding;
            if (c45694suq15 == null) {
                Intrinsics.gEmmrt("");
                c45694suq15 = null;
            }
            c45694suq15.getNewProxyInstance.setTextColor(-16711936);
        } else {
            C45694suq c45694suq16 = this.binding;
            if (c45694suq16 == null) {
                Intrinsics.gEmmrt("");
                c45694suq16 = null;
            }
            c45694suq16.getNewProxyInstance.setText("FAIL");
            C45694suq c45694suq17 = this.binding;
            if (c45694suq17 == null) {
                Intrinsics.gEmmrt("");
                c45694suq17 = null;
            }
            c45694suq17.getNewProxyInstance.setTextColor(SupportMenu.CATEGORY_MASK);
        }
        C45694suq c45694suq18 = this.binding;
        if (c45694suq18 == null) {
            Intrinsics.gEmmrt("");
            c45694suq18 = null;
        }
        c45694suq18.fJNWhG.setText("NA");
        C45694suq c45694suq19 = this.binding;
        if (c45694suq19 == null) {
            Intrinsics.gEmmrt("");
            c45694suq19 = null;
        }
        c45694suq19.zLjUOn.setText(lcaJwstModelResult.getPredictionSamePerson() == null ? "NA" : Intrinsics.EZpvd(lcaJwstModelResult.getPredictionSamePerson(), bool) ? "PASS" : "FAIL");
        C45694suq c45694suq20 = this.binding;
        if (c45694suq20 == null) {
            Intrinsics.gEmmrt("");
            c45694suq20 = null;
        }
        c45694suq20.hDKMBd.setText(Intrinsics.EZpvd(lcaJwstModelResult.getPredictionFaceQc(), bool) ? "PASS" : "FAIL");
        C45694suq c45694suq21 = this.binding;
        if (c45694suq21 == null) {
            Intrinsics.gEmmrt("");
            c45694suq21 = null;
        }
        c45694suq21.uzCIH.setText(Intrinsics.EZpvd(lcaJwstModelResult.getPredictionGlasses(), bool) ? "YES" : "NO");
        C45694suq c45694suq22 = this.binding;
        if (c45694suq22 == null) {
            Intrinsics.gEmmrt("");
            c45694suq22 = null;
        }
        c45694suq22.getFieldNames.setText(Intrinsics.EZpvd(lcaJwstModelResult.getPredictionGrimace(), bool) ? "YES" : "NO");
        C45694suq c45694suq23 = this.binding;
        if (c45694suq23 == null) {
            Intrinsics.gEmmrt("");
            c45694suq23 = null;
        }
        c45694suq23.AuCTelauCTel.setText(Intrinsics.EZpvd(lcaJwstModelResult.getPredictionPad(), bool) ? "PASS" : "FAIL");
        C45694suq c45694suq24 = this.binding;
        if (c45694suq24 == null) {
            Intrinsics.gEmmrt("");
            c45694suq24 = null;
        }
        c45694suq24.iwGUEr.setText(Intrinsics.EZpvd(lcaJwstModelResult.getPredictionGoodLighting(), bool) ? "PASS" : "FAIL");
        C45694suq c45694suq25 = this.binding;
        if (c45694suq25 == null) {
            Intrinsics.gEmmrt("");
            c45694suq25 = null;
        }
        c45694suq25.AuCTel.setText(lcaJwstModelResult.getPredictionBorder() != null ? Intrinsics.EZpvd(lcaJwstModelResult.getPredictionBorder(), bool) ? "PASS" : "FAIL" : "NA");
        C45694suq c45694suq26 = this.binding;
        if (c45694suq26 == null) {
            Intrinsics.gEmmrt("");
            c45694suq26 = null;
        }
        c45694suq26.wlaJM.setText(Intrinsics.EZpvd(lcaJwstModelResult.getPredictionColorSequence(), bool) ? "PASS" : "FAIL");
        C45694suq c45694suq27 = this.binding;
        if (c45694suq27 == null) {
            Intrinsics.gEmmrt("");
            c45694suq27 = null;
        }
        c45694suq27.djBIcL.removeAllViews();
        List<LcaColorChallenge> challenges = lcaJwstModelResult.getChallenges();
        if (challenges != null) {
            int i2 = 0;
            int i3 = 0;
            for (Object obj : challenges) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                LcaColorChallenge lcaColorChallenge = (LcaColorChallenge) obj;
                LayoutInflater layoutInflater = getLayoutInflater();
                C45694suq c45694suq28 = this.binding;
                if (c45694suq28 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq28 = null;
                }
                C45703suz c45703suzKWHzl = C45703suz.KWHzl(layoutInflater, c45694suq28.djBIcL, false);
                Intrinsics.checkNotNullExpressionValue(c45703suzKWHzl, "");
                TextView textView2 = c45703suzKWHzl.OLrzqt;
                int sequence = lcaColorChallenge.getSequence();
                StringBuilder sb = new StringBuilder();
                sb.append("Challenge Color ");
                sb.append(sequence - 2);
                textView2.setText(sb.toString());
                c45703suzKWHzl.EZpvd.setText(lcaColorChallenge.getCurrentTag());
                TextView textView3 = c45703suzKWHzl.AEQbTJ;
                int sequence2 = lcaColorChallenge.getSequence();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Predicted Color ");
                sb2.append(sequence2 - 2);
                textView3.setText(sb2.toString());
                c45703suzKWHzl.KWHzl.setText(lcaColorChallenge.getColorPrediction());
                if (Intrinsics.EZpvd((Object) lcaColorChallenge.getCurrentTag(), (Object) lcaColorChallenge.getColorPrediction())) {
                    i2++;
                } else {
                    c45703suzKWHzl.KWHzl.setTextColor(SupportMenu.CATEGORY_MASK);
                }
                C45694suq c45694suq29 = this.binding;
                if (c45694suq29 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq29 = null;
                }
                c45694suq29.djBIcL.addView(c45703suzKWHzl.getRoot());
                i3++;
            }
            i = i2;
        }
        List<LcaColorChallenge> challenges2 = lcaJwstModelResult.getChallenges();
        if (challenges2 != null) {
            C45694suq c45694suq30 = this.binding;
            if (c45694suq30 == null) {
                Intrinsics.gEmmrt("");
                c45694suq30 = null;
            }
            c45694suq30.fARcdN.setText(i + "/" + challenges2.size());
        }
        C45694suq c45694suq31 = this.binding;
        if (c45694suq31 == null) {
            Intrinsics.gEmmrt("");
            c45694suq31 = null;
        }
        c45694suq31.zsXlph.setText(str);
        C45694suq c45694suq32 = this.binding;
        if (c45694suq32 == null) {
            Intrinsics.gEmmrt("");
            c45694suq32 = null;
        }
        c45694suq32.ejfBZ.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugResultActivity.handleJwstQueryResultResponse$lambda$31(this.f$0, view);
            }
        });
        C45694suq c45694suq33 = this.binding;
        if (c45694suq33 == null) {
            Intrinsics.gEmmrt("");
            c45694suq33 = null;
        }
        c45694suq33.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugResultActivity.handleJwstQueryResultResponse$lambda$32(this.f$0, view);
            }
        });
        C45694suq c45694suq34 = this.binding;
        if (c45694suq34 == null) {
            Intrinsics.gEmmrt("");
            c45694suq34 = null;
        }
        c45694suq34.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugResultActivity.handleJwstQueryResultResponse$lambda$33(this.f$0, view);
            }
        });
        C45694suq c45694suq35 = this.binding;
        if (c45694suq35 == null) {
            Intrinsics.gEmmrt("");
            c45694suq35 = null;
        }
        c45694suq35.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugResultActivity.handleJwstQueryResultResponse$lambda$37(this.f$0, view);
            }
        });
        C45694suq c45694suq36 = this.binding;
        if (c45694suq36 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45694suq2 = c45694suq36;
        }
        c45694suq2.valueOf.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.shareVideo();
            }
        });
    }

    public static final void handleJwstQueryResultResponse$lambda$28(LcaDebugResultActivity lcaDebugResultActivity, View view) {
        lcaDebugResultActivity.startActivity(new Intent(lcaDebugResultActivity, (Class<?>) LcaDebugChunkListActivity.class));
    }

    public static final void handleJwstQueryResultResponse$lambda$31(LcaDebugResultActivity lcaDebugResultActivity, View view) {
        C45694suq c45694suq = lcaDebugResultActivity.binding;
        if (c45694suq == null) {
            Intrinsics.gEmmrt("");
            c45694suq = null;
        }
        lcaDebugResultActivity.copyToClipboard("binding.tvRequestId", c45694suq.zsXlph.getText().toString());
    }

    public static final void handleJwstQueryResultResponse$lambda$32(LcaDebugResultActivity lcaDebugResultActivity, View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lcaDebugResultActivity), Dispatchers.getDefault(), null, new LcaDebugResultActivity$handleJwstQueryResultResponse$6$1(lcaDebugResultActivity, null), 2, null);
    }

    public static final void handleJwstQueryResultResponse$lambda$33(LcaDebugResultActivity lcaDebugResultActivity, View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lcaDebugResultActivity), null, null, new LcaDebugResultActivity$handleJwstQueryResultResponse$7$1(lcaDebugResultActivity, null), 3, null);
    }

    public static final void handleJwstQueryResultResponse$lambda$37(final LcaDebugResultActivity lcaDebugResultActivity, View view) {
        final String qcScoreResultJson = LcaDebugDataManager.INSTANCE.getQcScoreResultJson();
        if (qcScoreResultJson != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(lcaDebugResultActivity);
            viewOnClickListenerC54939xaY.setTitle("Frame QC Score");
            viewOnClickListenerC54939xaY.EZpvd(qcScoreResultJson);
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) "OK", (View.OnClickListener) null);
            viewOnClickListenerC54939xaY.AEQbTJ("Copy", new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f$0.copyToClipboard("LcaDebugManager.responseRawJson", qcScoreResultJson);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$formatJsonAsync$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ String $raw;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$raw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$raw, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                try {
                    String str = this.$raw;
                    if (str != null && str.length() != 0) {
                        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().create();
                        JsonElement string = JsonParser.parseString(this.$raw);
                        Intrinsics.copydefault(string);
                        invokeSuspend$processJsonElement(string);
                        return gsonCreate.toJson(string);
                    }
                    return "No JSON data";
                } catch (Exception e) {
                    return "Invalid JSON: " + e.getMessage();
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        private static final void invokeSuspend$processJsonElement(JsonElement jsonElement) {
            if (jsonElement.isJsonObject()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject.has("first_reference_frame")) {
                    asJsonObject.addProperty("first_reference_frame", "[large data removed]");
                }
                if (asJsonObject.has("last_reference_frame")) {
                    asJsonObject.addProperty("last_reference_frame", "[large data removed]");
                }
                if (asJsonObject.has("referenceFrameBase64")) {
                    asJsonObject.addProperty("referenceFrameBase64", "[large data removed]");
                }
                Set<Map.Entry<String, JsonElement>> setEntrySet = asJsonObject.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
                Iterator<T> it = setEntrySet.iterator();
                while (it.hasNext()) {
                    Object value = ((Map.Entry) it.next()).getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "");
                    invokeSuspend$processJsonElement((JsonElement) value);
                }
                return;
            }
            if (jsonElement.isJsonArray()) {
                JsonArray asJsonArray = jsonElement.getAsJsonArray();
                Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                for (JsonElement jsonElement2 : asJsonArray) {
                    Intrinsics.copydefault(jsonElement2);
                    invokeSuspend$processJsonElement(jsonElement2);
                }
            }
        }
    }

    public final Deferred<String> formatJsonAsync(String str) {
        return BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new AnonymousClass1(str, null), 3, null);
    }

    public final void saveVideoToGallery(File file) throws FileNotFoundException {
        LcaMediaUtils.INSTANCE.saveVideoToGallery(this, file);
        C55328xhq.show$default(C55328xhq.OLrzqt, (CharSequence) "Save video to gallery successfully.", (Drawable) null, 0, (Integer) 80, 0, 0, 54, (Object) null).show();
    }

    public final void shareVideo() {
        try {
            File videoTempFile = LcaDebugDataManager.INSTANCE.getVideoTempFile();
            if (videoTempFile != null) {
                Uri uriForFile = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", videoTempFile);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("video/*");
                intent.putExtra("android.intent.extra.STREAM", uriForFile);
                intent.addFlags(1);
                startActivity(Intent.createChooser(intent, "分享视频"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void copyToClipboard(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Object systemService = getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, str2));
        C55328xhq.show$default(C55328xhq.OLrzqt, (CharSequence) "拷贝成功", (Drawable) null, 0, (Integer) 80, 0, 0, 54, (Object) null).show();
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$saveImageToGallery$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ Context $context;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17061(Context context, Bitmap bitmap, Continuation<? super C17061> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$bitmap = bitmap;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17061(this.$context, this.$bitmap, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            OutputStream outputStreamOpenOutputStream;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_display_name", "Image_" + System.currentTimeMillis() + ".jpg");
                        contentValues.put("mime_type", "image/jpeg");
                        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                        ContentResolver contentResolver = this.$context.getContentResolver();
                        Bitmap bitmap = this.$bitmap;
                        Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                        if (uriInsert != null && (outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert)) != null) {
                            try {
                                C56443yFo.KWHzl(bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream));
                                yFA.copydefault(outputStreamOpenOutputStream, null);
                            } finally {
                            }
                        }
                    } else {
                        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Image_" + System.currentTimeMillis() + ".jpg");
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            this.$bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            yFA.copydefault(fileOutputStream, null);
                            Context context = this.$context;
                            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                            intent.setData(Uri.fromFile(file));
                            context.sendBroadcast(intent);
                        } finally {
                        }
                    }
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(null);
                    this.label = 1;
                    if (BuildersKt.withContext(main, anonymousClass4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(e, null);
                this.label = 2;
                if (BuildersKt.withContext(main2, anonymousClass5, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$saveImageToGallery$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C55328xhq.show$default(C55328xhq.OLrzqt, "Save image to gallery successfully.", (Drawable) null, 0, C56443yFo.AEQbTJ(80), 0, 0, 54, (Object) null).show();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$saveImageToGallery$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Exception $e;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(Exception exc, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$e = exc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$e, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C55328xhq.show$default(C55328xhq.OLrzqt, "Image save failed: " + this.$e.getMessage(), (Drawable) null, 0, C56443yFo.AEQbTJ(80), 0, 0, 54, (Object) null).show();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void saveImageToGallery(Bitmap bitmap, Context context) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C17061(context, bitmap, null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
