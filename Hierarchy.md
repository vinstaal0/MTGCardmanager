* ICard
* Card implements ICard

---

**Interface + Class**

* Creature extends Card implements ICreature
* Planeswalker extends Card implements IPlaneswalker
* Enchantment extends Card implements IEnchantment
* Land extends Card extends Card implements ILand
* Instant extends Card extends Card implements IIstant
* Sorcery extends Card extends Card implements ISorcery
* Tribal extends Card extends Card implements ITribal
* Artifact extends Card extends Card implements IArtifact

---

* 

Ornithopter is both Creature and Artifact, but the main property is that it works like a creature, but it benefits from being an artifact.

Example: _card Ornithopter extends Creature, implements ICreature, IArtifact_

Spear of Heliod is both Enchatment and Artifact, it is both targeted by artifact and enchantment based effect, in this case extending Card makes more sense since it doesn't need to inherent from Artifact and enchantment.

Example: _card Spear_of_Heliod extends Card, implements IEnchantment, IArtifact_
