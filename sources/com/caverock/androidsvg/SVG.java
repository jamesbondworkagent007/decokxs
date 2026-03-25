package com.caverock.androidsvg;

import android.graphics.Picture;
import androidx.core.view.ViewCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.amplifyframework.core.model.ModelIdentifier;
import com.caverock.androidsvg.CSSParser;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.SM;
import o.SN;
import o.SO;

/* JADX INFO: loaded from: classes2.dex */
public class SVG {
    public static boolean KWHzl = true;
    public static SO copydefault;
    public SharedPreferences valueOf = null;
    public String AYXKKw = "";
    public String EZpvd = "";
    public float djBIcL = 96.0f;
    public CSSParser.PictureInPictureParams AEQbTJ = new CSSParser.PictureInPictureParams();
    public Map<String, AssetManager> OLrzqt = new HashMap();

    public static class Application extends Fragment {
        public PictureInPictureParams EZpvd;
        public PictureInPictureParams KWHzl;
        public PictureInPictureParams OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "circle";
        }
    }

    public static class AssistContent extends Cursor implements SharedElementCallback {
        public String AEQbTJ;
        public PictureInPictureParams EZpvd;
        public android.graphics.Matrix KWHzl;
        public PictureInPictureParams OLrzqt;
        public PictureInPictureParams copydefault;
        public PictureInPictureParams valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return TtmlNode.TAG_IMAGE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.SharedElementCallback
        public void KWHzl(android.graphics.Matrix matrix) {
            this.KWHzl = matrix;
        }
    }

    public static class Bitmap extends VoiceInteractor {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.VoiceInteractor, com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "switch";
        }
    }

    public static class BroadcastReceiver extends Fragment {
        public Float EZpvd;
        public Context KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "path";
        }
    }

    public static abstract class Canvas extends Cursor {
        public Activity getNewProxyInstance;
    }

    public static class ClipData extends Configuration implements ComponentName {
        public PictureInPictureParams AEQbTJ;
        public Boolean EZpvd;
        public Boolean KWHzl;
        public PictureInPictureParams OLrzqt;
        public PictureInPictureParams copydefault;
        public PictureInPictureParams valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "mask";
        }
    }

    public static abstract class ColorStateList extends PackageItemInfo implements ServiceConnection {
        public Set<String> gEmmrt = null;
        public String AhwBna = null;
        public Set<String> fetchVPNInfo = null;
        public Set<String> DbNXlk = null;
        public Set<String> djBIcL = null;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public void AEQbTJ(Set<String> set) {
            this.gEmmrt = set;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public void EZpvd(String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public void EZpvd(Set<String> set) {
            this.fetchVPNInfo = set;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public Set<String> KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public String OLrzqt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public void OLrzqt(Set<String> set) {
            this.DbNXlk = set;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public Set<String> copydefault() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public void copydefault(Set<String> set) {
            this.djBIcL = set;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public Set<String> djBIcL() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public Set<String> valueOf() {
            return this.fetchVPNInfo;
        }
    }

    public static class ComponentCallbacks extends Canvas implements ComponentName {
        public PictureInPictureParams AEQbTJ;
        public PictureInPictureParams AhwBna;
        public Float EZpvd;
        public PictureInPictureParams KWHzl;
        public boolean OLrzqt;
        public PictureInPictureParams copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return RequestParameters.MARKER;
        }
    }

    public interface ComponentName {
    }

    public static class ContentResolver extends Fragment {
        public float[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "polyline";
        }
    }

    public static class ContextWrapper extends ContentResolver {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ContentResolver, com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "polygon";
        }
    }

    public static abstract class Cursor extends Configuration {
        public PreserveAspectRatio hDKMBd = null;
    }

    public static class CursorFactory extends Canvas implements ComponentName {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "symbol";
        }
    }

    public static class DatabaseErrorHandler extends FragmentManager {
        public PictureInPictureParams AYXKKw;
        public PictureInPictureParams AhwBna;
        public PictureInPictureParams gEmmrt;
        public PictureInPictureParams valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "linearGradient";
        }
    }

    public static class Dialog extends VoiceInteractor implements ComponentName {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.VoiceInteractor, com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "defs";
        }
    }

    public static class DialogInterface extends Canvas implements ComponentName {
        public PictureInPictureParams AEQbTJ;
        public Boolean EZpvd;
        public Boolean KWHzl;
        public String OLrzqt;
        public android.graphics.Matrix copydefault;
        public PictureInPictureParams djBIcL;
        public PictureInPictureParams gEmmrt;
        public PictureInPictureParams valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "pattern";
        }
    }

    public static class Drawable extends Canvas implements ComponentName {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "view";
        }
    }

    public static abstract class Fragment extends ColorStateList implements SharedElementCallback {
        public android.graphics.Matrix AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.SharedElementCallback
        public void KWHzl(android.graphics.Matrix matrix) {
            this.AEQbTJ = matrix;
        }
    }

    public enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    public interface Intent {
        void AEQbTJ();

        void AEQbTJ(float f, float f2, float f3, float f4, float f5, float f6);

        void EZpvd(float f, float f2, float f3, float f4);

        void KWHzl(float f, float f2);

        void OLrzqt(float f, float f2);

        void copydefault(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);
    }

    public static class IntentSender extends Fragment {
        public PictureInPictureParams AYXKKw;
        public PictureInPictureParams EZpvd;
        public PictureInPictureParams KWHzl;
        public PictureInPictureParams OLrzqt;
        public PictureInPictureParams copydefault;
        public PictureInPictureParams valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "rect";
        }
    }

    public static class LoaderManager extends Fragment {
        public PictureInPictureParams EZpvd;
        public PictureInPictureParams KWHzl;
        public PictureInPictureParams OLrzqt;
        public PictureInPictureParams copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "ellipse";
        }
    }

    public static class MediaController extends VoiceInteractor {
        public String AEQbTJ;
        public PictureInPictureParams KWHzl;
        public PictureInPictureParams OLrzqt;
        public PictureInPictureParams copydefault;
        public PictureInPictureParams valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.VoiceInteractor, com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "use";
        }
    }

    public static class Mode extends Paint implements Uri, SharedElementCallback {
        public android.graphics.Matrix copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "text";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.SharedElementCallback
        public void KWHzl(android.graphics.Matrix matrix) {
            this.copydefault = matrix;
        }
    }

    public static abstract class PackageItemInfo extends AssetManager {
        public Activity ejfBZ = null;
    }

    public interface PackageManager {
        List<Resources> AEQbTJ();

        void KWHzl(Resources resources) throws SVGParseException;
    }

    public static abstract class Paint extends Matrix {
        public List<PictureInPictureParams> AEQbTJ;
        public List<PictureInPictureParams> EZpvd;
        public List<PictureInPictureParams> KWHzl;
        public List<PictureInPictureParams> OLrzqt;
    }

    public static class Point extends Matrix implements Rect {
        public String AEQbTJ;
        public PictureInPictureParams EZpvd;
        public Uri OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "textPath";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void EZpvd(Uri uri) {
            this.OLrzqt = uri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Rect
        public Uri gEmmrt() {
            return this.OLrzqt;
        }
    }

    public interface Rect {
        Uri gEmmrt();
    }

    public static class Resources {
        public SVG getFieldNames;
        public PackageManager iwGUEr;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String EZpvd() {
            return "";
        }
    }

    public static class SQLiteClosable extends Matrix implements Rect {
        public String KWHzl;
        public Uri OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "tref";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void KWHzl(Uri uri) {
            this.OLrzqt = uri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Rect
        public Uri gEmmrt() {
            return this.OLrzqt;
        }
    }

    public static class SQLiteDatabase extends Paint implements Rect {
        public Uri copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "tspan";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(Uri uri) {
            this.copydefault = uri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Rect
        public Uri gEmmrt() {
            return this.copydefault;
        }
    }

    public interface ServiceConnection {
        void AEQbTJ(Set<String> set);

        void EZpvd(String str);

        void EZpvd(Set<String> set);

        Set<String> KWHzl();

        String OLrzqt();

        void OLrzqt(Set<String> set);

        Set<String> copydefault();

        void copydefault(Set<String> set);

        Set<String> djBIcL();

        Set<String> valueOf();
    }

    public interface SharedElementCallback {
        void KWHzl(android.graphics.Matrix matrix);
    }

    public static class SharedPreferences extends Canvas {
        public PictureInPictureParams AEQbTJ;
        public PictureInPictureParams EZpvd;
        public PictureInPictureParams KWHzl;
        public String OLrzqt;
        public PictureInPictureParams copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "svg";
        }
    }

    public static class StateListAnimator extends VoiceInteractor implements ComponentName {
        public Boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.VoiceInteractor, com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "clipPath";
        }
    }

    public static class TaskStackBuilder extends Fragment {
        public PictureInPictureParams EZpvd;
        public PictureInPictureParams KWHzl;
        public PictureInPictureParams OLrzqt;
        public PictureInPictureParams copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "line";
        }
    }

    public static class Theme extends FragmentManager {
        public PictureInPictureParams AYXKKw;
        public PictureInPictureParams AhwBna;
        public PictureInPictureParams djBIcL;
        public PictureInPictureParams gEmmrt;
        public PictureInPictureParams valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "radialGradient";
        }
    }

    public static abstract class TypedArray implements Cloneable {
    }

    public enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public interface Uri {
    }

    public static class VoiceInteractor extends Configuration implements SharedElementCallback {
        public android.graphics.Matrix EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "group";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.SharedElementCallback
        public void KWHzl(android.graphics.Matrix matrix) {
            this.EZpvd = matrix;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SO copydefault() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SharedPreferences EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(SharedPreferences sharedPreferences) {
        this.valueOf = sharedPreferences;
    }

    public static SVG AEQbTJ(InputStream inputStream) throws SVGParseException {
        return new SVGParser().KWHzl(inputStream, KWHzl);
    }

    public Picture valueOf() {
        return copydefault((SM) null);
    }

    public Picture copydefault(SM sm) {
        PictureInPictureParams pictureInPictureParams;
        Activity activity = (sm == null || !sm.KWHzl()) ? this.valueOf.getNewProxyInstance : sm.OLrzqt;
        if (sm != null && sm.valueOf()) {
            return OLrzqt((int) Math.ceil(sm.gEmmrt.KWHzl()), (int) Math.ceil(sm.gEmmrt.EZpvd()), sm);
        }
        SharedPreferences sharedPreferences = this.valueOf;
        PictureInPictureParams pictureInPictureParams2 = sharedPreferences.AEQbTJ;
        if (pictureInPictureParams2 != null) {
            Unit unit = pictureInPictureParams2.KWHzl;
            Unit unit2 = Unit.percent;
            if (unit != unit2 && (pictureInPictureParams = sharedPreferences.KWHzl) != null && pictureInPictureParams.KWHzl != unit2) {
                return OLrzqt((int) Math.ceil(pictureInPictureParams2.KWHzl(this.djBIcL)), (int) Math.ceil(this.valueOf.KWHzl.KWHzl(this.djBIcL)), sm);
            }
        }
        if (pictureInPictureParams2 != null && activity != null) {
            return OLrzqt((int) Math.ceil(pictureInPictureParams2.KWHzl(this.djBIcL)), (int) Math.ceil((activity.KWHzl * r1) / activity.AEQbTJ), sm);
        }
        PictureInPictureParams pictureInPictureParams3 = sharedPreferences.KWHzl;
        if (pictureInPictureParams3 != null && activity != null) {
            return OLrzqt((int) Math.ceil((activity.AEQbTJ * r1) / activity.KWHzl), (int) Math.ceil(pictureInPictureParams3.KWHzl(this.djBIcL)), sm);
        }
        return OLrzqt(512, 512, sm);
    }

    public Picture OLrzqt(int i, int i2, SM sm) {
        Picture picture = new Picture();
        android.graphics.Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        if (sm == null || sm.gEmmrt == null) {
            sm = sm == null ? new SM() : new SM(sm);
            sm.KWHzl(0.0f, 0.0f, i, i2);
        }
        new SN(canvasBeginRecording, this.djBIcL).copydefault(this, sm);
        picture.endRecording();
        return picture;
    }

    public void OLrzqt(float f) {
        SharedPreferences sharedPreferences = this.valueOf;
        if (sharedPreferences == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        sharedPreferences.AEQbTJ = new PictureInPictureParams(f);
    }

    public void KWHzl(float f) {
        SharedPreferences sharedPreferences = this.valueOf;
        if (sharedPreferences == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        sharedPreferences.KWHzl = new PictureInPictureParams(f);
    }

    public Resources KWHzl(String str) {
        if (str == null) {
            return null;
        }
        String strCopydefault = copydefault(str);
        if (strCopydefault.length() <= 1 || !strCopydefault.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
            return null;
        }
        return OLrzqt(strCopydefault.substring(1));
    }

    public final String copydefault(String str) {
        if (str.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) && str.endsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)) {
            str = str.substring(1, str.length() - 1).replace("\\\"", ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    public void AEQbTJ(CSSParser.PictureInPictureParams pictureInPictureParams) {
        this.AEQbTJ.EZpvd(pictureInPictureParams);
    }

    public List<CSSParser.VoiceInteractor> OLrzqt() {
        return this.AEQbTJ.OLrzqt();
    }

    public boolean AEQbTJ() {
        return !this.AEQbTJ.KWHzl();
    }

    public void KWHzl() {
        this.AEQbTJ.EZpvd(CSSParser.Source.RenderOptions);
    }

    public static class Activity {
        public float AEQbTJ;
        public float KWHzl;
        public float OLrzqt;
        public float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public float EZpvd() {
            return this.OLrzqt + this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public float KWHzl() {
            return this.copydefault + this.AEQbTJ;
        }

        public Activity(float f, float f2, float f3, float f4) {
            this.copydefault = f;
            this.OLrzqt = f2;
            this.AEQbTJ = f3;
            this.KWHzl = f4;
        }

        public Activity(Activity activity) {
            this.copydefault = activity.copydefault;
            this.OLrzqt = activity.OLrzqt;
            this.AEQbTJ = activity.AEQbTJ;
            this.KWHzl = activity.KWHzl;
        }

        public static Activity AEQbTJ(float f, float f2, float f3, float f4) {
            return new Activity(f, f2, f3 - f, f4 - f2);
        }

        public void OLrzqt(Activity activity) {
            float f = activity.copydefault;
            if (f < this.copydefault) {
                this.copydefault = f;
            }
            float f2 = activity.OLrzqt;
            if (f2 < this.OLrzqt) {
                this.OLrzqt = f2;
            }
            if (activity.KWHzl() > KWHzl()) {
                this.AEQbTJ = activity.KWHzl() - this.copydefault;
            }
            if (activity.EZpvd() > EZpvd()) {
                this.KWHzl = activity.EZpvd() - this.OLrzqt;
            }
        }

        public String toString() {
            return "[" + this.copydefault + " " + this.OLrzqt + " " + this.AEQbTJ + " " + this.KWHzl + "]";
        }
    }

    public static class Style implements Cloneable {
        public ActionBar AEQbTJ;
        public FillRule AYXKKw;
        public List<String> AhwBna;
        public RenderQuality AkhnZx;
        public String AuCTel;
        public TypedArray AuCTelauCTel;
        public LineJoin AubY;
        public Float AwvSrB;
        public TextAnchor AxsJAY;
        public VectorEffect DTwDnp;
        public PictureInPictureParams DbNXlk;
        public TextDirection EZpvd;
        public String KWHzl;
        public TaskDescription OLrzqt;
        public TypedArray OcIXYQ;
        public Boolean QKVWgx;
        public Float QOLQEE;
        public FillRule copydefault;
        public TypedArray djBIcL;
        public Boolean ejfBZ;
        public String fARcdN;
        public String fIwbmz;
        public Float fJNWhG;
        public String fetchVPNInfo;
        public Float gEmmrt;
        public TextDecoration gHZMYf;
        public TypedArray getFieldNames;
        public long getNewProxyInstance = 0;
        public Float hDKMBd;
        public Integer isConnected;
        public TypedArray iwGUEr;
        public Float sSMYrx;
        public Float uzCIH;
        public Boolean valueOf;
        public FontStyle values;
        public PictureInPictureParams wlaJM;
        public LineCap zLjUOn;
        public PictureInPictureParams[] zsXlph;
        public PictureInPictureParams zuBGHE;

        public enum FillRule {
            NonZero,
            EvenOdd
        }

        public enum FontStyle {
            Normal,
            Italic,
            Oblique
        }

        public enum LineCap {
            Butt,
            Round,
            Square
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel
        }

        public enum RenderQuality {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum TextAnchor {
            Start,
            Middle,
            End
        }

        public enum TextDecoration {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum TextDirection {
            LTR,
            RTL
        }

        public enum VectorEffect {
            None,
            NonScalingStroke
        }

        public static Style OLrzqt() {
            Style style = new Style();
            style.getNewProxyInstance = -1L;
            TaskDescription taskDescription = TaskDescription.OLrzqt;
            style.djBIcL = taskDescription;
            FillRule fillRule = FillRule.NonZero;
            style.AYXKKw = fillRule;
            Float fValueOf = Float.valueOf(1.0f);
            style.gEmmrt = fValueOf;
            style.AuCTelauCTel = null;
            style.AwvSrB = fValueOf;
            style.zuBGHE = new PictureInPictureParams(1.0f);
            style.zLjUOn = LineCap.Butt;
            style.AubY = LineJoin.Miter;
            style.sSMYrx = Float.valueOf(4.0f);
            style.zsXlph = null;
            style.wlaJM = new PictureInPictureParams(0.0f);
            style.fJNWhG = fValueOf;
            style.OLrzqt = taskDescription;
            style.AhwBna = null;
            style.DbNXlk = new PictureInPictureParams(12.0f, Unit.pt);
            style.isConnected = 400;
            style.values = FontStyle.Normal;
            style.gHZMYf = TextDecoration.None;
            style.EZpvd = TextDirection.LTR;
            style.AxsJAY = TextAnchor.Start;
            Boolean bool = Boolean.TRUE;
            style.ejfBZ = bool;
            style.AEQbTJ = null;
            style.fARcdN = null;
            style.AuCTel = null;
            style.fetchVPNInfo = null;
            style.valueOf = bool;
            style.QKVWgx = bool;
            style.iwGUEr = taskDescription;
            style.uzCIH = fValueOf;
            style.KWHzl = null;
            style.copydefault = fillRule;
            style.fIwbmz = null;
            style.getFieldNames = null;
            style.hDKMBd = fValueOf;
            style.OcIXYQ = null;
            style.QOLQEE = fValueOf;
            style.DTwDnp = VectorEffect.None;
            style.AkhnZx = RenderQuality.auto;
            return style;
        }

        public void OLrzqt(boolean z) {
            Boolean bool = Boolean.TRUE;
            this.valueOf = bool;
            if (!z) {
                bool = Boolean.FALSE;
            }
            this.ejfBZ = bool;
            this.AEQbTJ = null;
            this.KWHzl = null;
            this.fJNWhG = Float.valueOf(1.0f);
            this.iwGUEr = TaskDescription.OLrzqt;
            this.uzCIH = Float.valueOf(1.0f);
            this.fIwbmz = null;
            this.getFieldNames = null;
            this.hDKMBd = Float.valueOf(1.0f);
            this.OcIXYQ = null;
            this.QOLQEE = Float.valueOf(1.0f);
            this.DTwDnp = VectorEffect.None;
        }

        public Object clone() throws CloneNotSupportedException {
            Style style = (Style) super.clone();
            PictureInPictureParams[] pictureInPictureParamsArr = this.zsXlph;
            if (pictureInPictureParamsArr != null) {
                style.zsXlph = (PictureInPictureParams[]) pictureInPictureParamsArr.clone();
            }
            return style;
        }
    }

    public static class TaskDescription extends TypedArray {
        public int AEQbTJ;
        public static final TaskDescription OLrzqt = new TaskDescription(ViewCompat.MEASURED_STATE_MASK);
        public static final TaskDescription KWHzl = new TaskDescription(0);

        public TaskDescription(int i) {
            this.AEQbTJ = i;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.AEQbTJ));
        }
    }

    public static class PendingIntent extends TypedArray {
        public static PendingIntent AEQbTJ = new PendingIntent();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static PendingIntent OLrzqt() {
            return AEQbTJ;
        }

        private PendingIntent() {
        }
    }

    public static class ComponentCallbacks2 extends TypedArray {
        public String AEQbTJ;
        public TypedArray OLrzqt;

        public ComponentCallbacks2(String str, TypedArray typedArray) {
            this.AEQbTJ = str;
            this.OLrzqt = typedArray;
        }

        public String toString() {
            return this.AEQbTJ + " " + this.OLrzqt;
        }
    }

    public static class PictureInPictureParams implements Cloneable {
        public float EZpvd;
        public Unit KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public float AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean EZpvd() {
            return this.EZpvd < 0.0f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean copydefault() {
            return this.EZpvd == 0.0f;
        }

        public PictureInPictureParams(float f, Unit unit) {
            this.EZpvd = f;
            this.KWHzl = unit;
        }

        public PictureInPictureParams(float f) {
            this.EZpvd = f;
            this.KWHzl = Unit.px;
        }

        public float copydefault(SN sn) {
            switch (AnonymousClass5.AEQbTJ[this.KWHzl.ordinal()]) {
                case 9:
                    Activity activityGEmmrt = sn.gEmmrt();
                    if (activityGEmmrt != null) {
                    }
                    break;
            }
            return this.EZpvd;
        }

        public float OLrzqt(SN sn) {
            if (this.KWHzl == Unit.percent) {
                Activity activityGEmmrt = sn.gEmmrt();
                return activityGEmmrt == null ? this.EZpvd : (this.EZpvd * activityGEmmrt.KWHzl) / 100.0f;
            }
            return copydefault(sn);
        }

        public float AEQbTJ(SN sn) {
            if (this.KWHzl == Unit.percent) {
                Activity activityGEmmrt = sn.gEmmrt();
                if (activityGEmmrt == null) {
                    return this.EZpvd;
                }
                float f = activityGEmmrt.AEQbTJ;
                if (f == activityGEmmrt.KWHzl) {
                    return (this.EZpvd * f) / 100.0f;
                }
                return (this.EZpvd * ((float) (Math.sqrt((f * f) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
            }
            return copydefault(sn);
        }

        public float KWHzl(SN sn, float f) {
            return this.KWHzl == Unit.percent ? (this.EZpvd * f) / 100.0f : copydefault(sn);
        }

        public float KWHzl(float f) {
            int i = AnonymousClass5.AEQbTJ[this.KWHzl.ordinal()];
            if (i == 1) {
                return this.EZpvd;
            }
            switch (i) {
                case 4:
                    return this.EZpvd * f;
                case 5:
                    return (this.EZpvd * f) / 2.54f;
                case 6:
                    return (this.EZpvd * f) / 25.4f;
                case 7:
                    return (this.EZpvd * f) / 72.0f;
                case 8:
                    return (this.EZpvd * f) / 6.0f;
                default:
                    return this.EZpvd;
            }
        }

        public String toString() {
            return String.valueOf(this.EZpvd) + this.KWHzl;
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.SVG$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[Unit.values().length];
            AEQbTJ = iArr;
            try {
                iArr[Unit.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[Unit.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[Unit.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[Unit.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[Unit.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AEQbTJ[Unit.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AEQbTJ[Unit.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AEQbTJ[Unit.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AEQbTJ[Unit.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class ActionBar {
        public PictureInPictureParams AEQbTJ;
        public PictureInPictureParams EZpvd;
        public PictureInPictureParams OLrzqt;
        public PictureInPictureParams copydefault;

        public ActionBar(PictureInPictureParams pictureInPictureParams, PictureInPictureParams pictureInPictureParams2, PictureInPictureParams pictureInPictureParams3, PictureInPictureParams pictureInPictureParams4) {
            this.EZpvd = pictureInPictureParams;
            this.OLrzqt = pictureInPictureParams2;
            this.copydefault = pictureInPictureParams3;
            this.AEQbTJ = pictureInPictureParams4;
        }
    }

    public static abstract class AssetManager extends Resources {
        public String fJNWhG = null;
        public Boolean fARcdN = null;
        public Style AuCTel = null;
        public Style uzCIH = null;
        public List<String> fIwbmz = null;

        public String toString() {
            return EZpvd();
        }
    }

    public static abstract class Configuration extends PackageItemInfo implements PackageManager, ServiceConnection {
        public List<Resources> AYXKKw = new ArrayList();
        public Set<String> DbNXlk = null;
        public String values = null;
        public Set<String> isConnected = null;
        public Set<String> fetchVPNInfo = null;
        public Set<String> AkhnZx = null;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.PackageManager
        public List<Resources> AEQbTJ() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public void AEQbTJ(Set<String> set) {
            this.DbNXlk = set;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public void EZpvd(String str) {
            this.values = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public void EZpvd(Set<String> set) {
            this.isConnected = set;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public Set<String> KWHzl() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public String OLrzqt() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public void OLrzqt(Set<String> set) {
            this.fetchVPNInfo = set;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public Set<String> copydefault() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public void copydefault(Set<String> set) {
            this.AkhnZx = set;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public Set<String> djBIcL() {
            return this.fetchVPNInfo;
        }

        @Override // com.caverock.androidsvg.SVG.ServiceConnection
        public Set<String> valueOf() {
            return null;
        }

        @Override // com.caverock.androidsvg.SVG.PackageManager
        public void KWHzl(Resources resources) throws SVGParseException {
            this.AYXKKw.add(resources);
        }
    }

    public static abstract class Matrix extends Configuration {
        @Override // com.caverock.androidsvg.SVG.Configuration, com.caverock.androidsvg.SVG.PackageManager
        public void KWHzl(Resources resources) throws SVGParseException {
            if (resources instanceof Rect) {
                this.AYXKKw.add(resources);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + resources + " elements.");
        }
    }

    public static class Callback extends Resources implements Rect {
        public String AEQbTJ;
        public Uri EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Rect
        public Uri gEmmrt() {
            return this.EZpvd;
        }

        public Callback(String str) {
            this.AEQbTJ = str;
        }

        public String toString() {
            return "TextChild: '" + this.AEQbTJ + "'";
        }
    }

    public static abstract class FragmentManager extends AssetManager implements PackageManager {
        public android.graphics.Matrix AEQbTJ;
        public Boolean EZpvd;
        public GradientSpread KWHzl;
        public String OLrzqt;
        public List<Resources> copydefault = new ArrayList();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.PackageManager
        public List<Resources> AEQbTJ() {
            return this.copydefault;
        }

        @Override // com.caverock.androidsvg.SVG.PackageManager
        public void KWHzl(Resources resources) throws SVGParseException {
            if (resources instanceof ApplicationInfo) {
                this.copydefault.add(resources);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + resources + " elements.");
        }
    }

    public static class ApplicationInfo extends AssetManager implements PackageManager {
        public Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "stop";
        }

        @Override // com.caverock.androidsvg.SVG.PackageManager
        public void KWHzl(Resources resources) {
        }

        @Override // com.caverock.androidsvg.SVG.PackageManager
        public List<Resources> AEQbTJ() {
            return Collections.emptyList();
        }
    }

    public static class IntentFilter extends AssetManager implements PackageManager {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.caverock.androidsvg.SVG.Resources
        public String EZpvd() {
            return "solidColor";
        }

        @Override // com.caverock.androidsvg.SVG.PackageManager
        public void KWHzl(Resources resources) {
        }

        @Override // com.caverock.androidsvg.SVG.PackageManager
        public List<Resources> AEQbTJ() {
            return Collections.emptyList();
        }
    }

    public static class Context implements Intent {
        public int KWHzl = 0;
        public int AEQbTJ = 0;
        public byte[] copydefault = new byte[8];
        public float[] EZpvd = new float[16];

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean EZpvd() {
            return this.KWHzl == 0;
        }

        public final void copydefault(byte b) {
            int i = this.KWHzl;
            byte[] bArr = this.copydefault;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.copydefault = bArr2;
            }
            byte[] bArr3 = this.copydefault;
            int i2 = this.KWHzl;
            this.KWHzl = i2 + 1;
            bArr3[i2] = b;
        }

        public final void KWHzl(int i) {
            float[] fArr = this.EZpvd;
            if (fArr.length < this.AEQbTJ + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.EZpvd = fArr2;
            }
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void KWHzl(float f, float f2) {
            copydefault((byte) 0);
            KWHzl(2);
            float[] fArr = this.EZpvd;
            int i = this.AEQbTJ;
            fArr[i] = f;
            this.AEQbTJ = i + 2;
            fArr[i + 1] = f2;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void OLrzqt(float f, float f2) {
            copydefault((byte) 1);
            KWHzl(2);
            float[] fArr = this.EZpvd;
            int i = this.AEQbTJ;
            fArr[i] = f;
            this.AEQbTJ = i + 2;
            fArr[i + 1] = f2;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void AEQbTJ(float f, float f2, float f3, float f4, float f5, float f6) {
            copydefault((byte) 2);
            KWHzl(6);
            float[] fArr = this.EZpvd;
            int i = this.AEQbTJ;
            fArr[i] = f;
            fArr[i + 1] = f2;
            fArr[i + 2] = f3;
            fArr[i + 3] = f4;
            fArr[i + 4] = f5;
            this.AEQbTJ = i + 6;
            fArr[i + 5] = f6;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void EZpvd(float f, float f2, float f3, float f4) {
            copydefault((byte) 3);
            KWHzl(4);
            float[] fArr = this.EZpvd;
            int i = this.AEQbTJ;
            fArr[i] = f;
            fArr[i + 1] = f2;
            fArr[i + 2] = f3;
            this.AEQbTJ = i + 4;
            fArr[i + 3] = f4;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void copydefault(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            copydefault((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            KWHzl(5);
            float[] fArr = this.EZpvd;
            int i = this.AEQbTJ;
            fArr[i] = f;
            fArr[i + 1] = f2;
            fArr[i + 2] = f3;
            fArr[i + 3] = f4;
            this.AEQbTJ = i + 5;
            fArr[i + 4] = f5;
        }

        @Override // com.caverock.androidsvg.SVG.Intent
        public void AEQbTJ() {
            copydefault((byte) 8);
        }

        public void EZpvd(Intent intent) {
            int i;
            int i2 = 0;
            for (int i3 = 0; i3 < this.KWHzl; i3++) {
                byte b = this.copydefault[i3];
                if (b == 0) {
                    float[] fArr = this.EZpvd;
                    i = i2 + 2;
                    intent.KWHzl(fArr[i2], fArr[i2 + 1]);
                } else if (b != 1) {
                    if (b == 2) {
                        float[] fArr2 = this.EZpvd;
                        intent.AEQbTJ(fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3], fArr2[i2 + 4], fArr2[i2 + 5]);
                        i2 += 6;
                    } else if (b == 3) {
                        float[] fArr3 = this.EZpvd;
                        intent.EZpvd(fArr3[i2], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3]);
                        i2 += 4;
                    } else if (b == 8) {
                        intent.AEQbTJ();
                    } else {
                        boolean z = (b & 2) != 0;
                        boolean z2 = (b & 1) != 0;
                        float[] fArr4 = this.EZpvd;
                        intent.copydefault(fArr4[i2], fArr4[i2 + 1], fArr4[i2 + 2], z, z2, fArr4[i2 + 3], fArr4[i2 + 4]);
                        i2 += 5;
                    }
                } else {
                    float[] fArr5 = this.EZpvd;
                    i = i2 + 2;
                    intent.OLrzqt(fArr5[i2], fArr5[i2 + 1]);
                }
                i2 = i;
            }
        }
    }

    public AssetManager OLrzqt(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.valueOf.fJNWhG)) {
            return this.valueOf;
        }
        if (this.OLrzqt.containsKey(str)) {
            return this.OLrzqt.get(str);
        }
        AssetManager assetManagerEZpvd = EZpvd(this.valueOf, str);
        this.OLrzqt.put(str, assetManagerEZpvd);
        return assetManagerEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.caverock.androidsvg.SVG$PackageManager */
    /* JADX WARN: Multi-variable type inference failed */
    public final AssetManager EZpvd(PackageManager packageManager, String str) {
        AssetManager assetManagerEZpvd;
        AssetManager assetManager = (AssetManager) packageManager;
        if (str.equals(assetManager.fJNWhG)) {
            return assetManager;
        }
        for (Object obj : packageManager.AEQbTJ()) {
            if (obj instanceof AssetManager) {
                AssetManager assetManager2 = (AssetManager) obj;
                if (str.equals(assetManager2.fJNWhG)) {
                    return assetManager2;
                }
                if ((obj instanceof PackageManager) && (assetManagerEZpvd = EZpvd((PackageManager) obj, str)) != null) {
                    return assetManagerEZpvd;
                }
            }
        }
        return null;
    }
}
