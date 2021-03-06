package edu.berkeley.nlp.assignments.align.student;

import edu.berkeley.nlp.langmodel.NgramLanguageModel;
import edu.berkeley.nlp.mt.SentencePair;
import edu.berkeley.nlp.mt.WordAligner;
import edu.berkeley.nlp.mt.WordAlignerFactory;
import edu.berkeley.nlp.mt.decoder.Decoder;
import edu.berkeley.nlp.mt.decoder.DecoderFactory;
import edu.berkeley.nlp.mt.decoder.DistortionModel;
import edu.berkeley.nlp.mt.phrasetable.PhraseTable;

public class Model1AlignerFactory implements WordAlignerFactory
{
	public WordAligner newAligner(Iterable<SentencePair> trainingData) {
        return new Model1WordAligner(trainingData);
	}
}
