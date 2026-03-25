package org.tensorflow.lite.support.audio;

import org.tensorflow.lite.support.audio.TensorAudio;

/* JADX INFO: loaded from: classes25.dex */
final class AutoValue_TensorAudio_TensorAudioFormat extends TensorAudio.TensorAudioFormat {
    private final int channels;
    private final int sampleRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.support.audio.TensorAudio.TensorAudioFormat
    public int getChannels() {
        return this.channels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.support.audio.TensorAudio.TensorAudioFormat
    public int getSampleRate() {
        return this.sampleRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return ((this.channels ^ 1000003) * 1000003) ^ this.sampleRate;
    }

    private AutoValue_TensorAudio_TensorAudioFormat(int i, int i2) {
        this.channels = i;
        this.sampleRate = i2;
    }

    public String toString() {
        return "TensorAudioFormat{channels=" + this.channels + ", sampleRate=" + this.sampleRate + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TensorAudio.TensorAudioFormat)) {
            return false;
        }
        TensorAudio.TensorAudioFormat tensorAudioFormat = (TensorAudio.TensorAudioFormat) obj;
        return this.channels == tensorAudioFormat.getChannels() && this.sampleRate == tensorAudioFormat.getSampleRate();
    }

    public static final class Builder extends TensorAudio.TensorAudioFormat.Builder {
        private Integer channels;
        private Integer sampleRate;

        @Override // org.tensorflow.lite.support.audio.TensorAudio.TensorAudioFormat.Builder
        public TensorAudio.TensorAudioFormat.Builder setChannels(int i) {
            this.channels = Integer.valueOf(i);
            return this;
        }

        @Override // org.tensorflow.lite.support.audio.TensorAudio.TensorAudioFormat.Builder
        public TensorAudio.TensorAudioFormat.Builder setSampleRate(int i) {
            this.sampleRate = Integer.valueOf(i);
            return this;
        }

        @Override // org.tensorflow.lite.support.audio.TensorAudio.TensorAudioFormat.Builder
        public TensorAudio.TensorAudioFormat autoBuild() {
            String str = "";
            if (this.channels == null) {
                str = " channels";
            }
            if (this.sampleRate == null) {
                str = str + " sampleRate";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_TensorAudio_TensorAudioFormat(this.channels.intValue(), this.sampleRate.intValue());
        }
    }
}
